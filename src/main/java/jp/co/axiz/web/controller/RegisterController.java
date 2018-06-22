package jp.co.axiz.web.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.entity.Admin;
import jp.co.axiz.web.entity.SessionInfo;
import jp.co.axiz.web.entity.UserInfo;
import jp.co.axiz.web.form.RegisterForm;
import jp.co.axiz.web.service.impl.AdminService;
import jp.co.axiz.web.service.impl.UserInfoService;

@Controller
public class RegisterController {

	@Autowired
	private SessionInfo sessionInfo;

	@Autowired
	private AdminService adminService;

	@Autowired
	MessageSource messageSource;

	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping("/register")
	public String insert(@ModelAttribute("registerForm") RegisterForm form, Model model) {
		return "register";
	}

	@RequestMapping(value = "/registerConfirm", method = RequestMethod.POST)
	public String insertConfirm(@Validated @ModelAttribute("registerForm") RegisterForm form, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			String errorMsg = messageSource.getMessage("required.error", null, Locale.getDefault());
			model.addAttribute("errmsg", errorMsg);
			return "register";
		}

		Admin userId = adminService.idikeru(form.getUserId());
		if (userId == null) {

			UserInfo user = new UserInfo();
			user.setUserId(form.getUserId());
			user.setUserName(form.getName());
			user.setPassword(form.getPassword());

			sessionInfo.setNewUser(user);
			return "registerConfirm";

		} else {

			String errorMsg = messageSource.getMessage("id.error", null, Locale.getDefault());
			model.addAttribute("errmsg", errorMsg);

			return "register";
		}

	}

	@RequestMapping(value = "/registerBack")
	public String insertBack(@ModelAttribute("registerForm") RegisterForm form, Model model) {

		UserInfo user = sessionInfo.getNewUser();

		form.setUserId(user.getUserId());
		form.setName(user.getUserName());
		form.setPassword(user.getPassword());

		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String insertExecute(@Validated @ModelAttribute("registerForm") RegisterForm form, BindingResult bindingResult,
			Model model) {

		UserInfo user = sessionInfo.getNewUser();

		if(!user.getPassword().equals(form.getConfirmPassword())) {
			String errorMsg = messageSource.getMessage("password.not.match.error", null, Locale.getDefault());
			model.addAttribute("errmsg", errorMsg);

			form.setConfirmPassword("");

			return "registerConfirm";
		}

		String id = userInfoService.insert(user);

		sessionInfo.setNewUser(null);

		form.setUserId(id);

		model.addAttribute("user", sessionInfo.getLoginUser());


		//String errorMsg = messageSource.getMessage("login.error", null, Locale.getDefault());

		Admin admin = adminService.authentication(form.getUserId(), form.getPassword());

		sessionInfo.setLoginUser(admin);

		model.addAttribute("user", sessionInfo.getLoginUser());
		return "registerResult";
	}
}
