package jp.co.axiz.web.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

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
import jp.co.axiz.web.form.DeleteForm;
import jp.co.axiz.web.service.impl.AdminService;

@Controller
public class DeleteController {

	@Autowired
	private SessionInfo sessionInfo;

	@Autowired
	MessageSource messageSource;

	@Autowired
	private AdminService adminService;

	@Autowired
	HttpSession ses;

	@RequestMapping("/delete")
	public String delete(@ModelAttribute("deleteForm") DeleteForm form, Model model) {
		return "delete";
	}

	@RequestMapping(value = "/deleteConfirm", method = RequestMethod.POST)
	public String deleteConfirm(@Validated @ModelAttribute("deleteForm") DeleteForm form, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			String errorMsg = messageSource.getMessage("required.error", null, Locale.getDefault());
			model.addAttribute("errmsg", errorMsg);
			return "delete";
		}

		Admin admin = adminService.idikeru(form.getUserId());

		if(admin == null) {
			String errorMsg = messageSource.getMessage("id.not.found.error", null, Locale.getDefault());
			model.addAttribute("errmsg", errorMsg);
			return "delete";
		}

		form.setName(admin.getUserNAME());


		return "deleteConfirm";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteExecute(@Validated @ModelAttribute("deleteForm") DeleteForm form, BindingResult bindingResult,
			Model model) {

		String id = form.getUserId();

		adminService.delete(id);

		model.addAttribute("user", sessionInfo.getLoginUser());

		sessionInfo.invalidate();

		ses.invalidate();

		return "deleteResult";
	}
}
