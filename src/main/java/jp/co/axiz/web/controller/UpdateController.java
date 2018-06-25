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

import jp.co.axiz.web.entity.SessionInfo;
import jp.co.axiz.web.entity.UserInfo;
import jp.co.axiz.web.form.UpdateForm;
import jp.co.axiz.web.service.impl.UserInfoService;

@Controller
public class UpdateController {

	@Autowired
	private SessionInfo sessionInfo;

	@Autowired
	MessageSource messageSource;

	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping("/update")
	public String update(@ModelAttribute("updateForm") UpdateForm form, Model model) {
		return "update";
	}

	@RequestMapping(value = "/updateInput", method = RequestMethod.POST)
	public String updateInput(@Validated @ModelAttribute("updateForm") UpdateForm form, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasFieldErrors("userId")) {
			String errorMsg = messageSource.getMessage("required.error", null, Locale.getDefault());
			model.addAttribute("errmsg", errorMsg);
			return "update";
		}

		UserInfo user = userInfoService.findById(form.getUserId());

		if(user == null) {
			String errorMsg = messageSource.getMessage("id.not.found.error", null, Locale.getDefault());
			model.addAttribute("errmsg", errorMsg);
			return "update";
		}

		sessionInfo.setPrevUser(user);

		form.setNewName(user.getUserName());
		form.setNewTel(user.getTelephone());
		form.setNewlocation(user.getLocation());
		form.setNewdepartment(user.getDepartment());
		form.setNewqualification(user.getQualification());
		form.setNewmerit(user.getMerit());
		form.setNewdemerit(user.getDemerit());

		form.setNewindustry(user.getIndustry());
		form.setNewwork_location(user.getWork_location());
		form.setNewfight(user.getFight());

		return "updateInput";
	}

	@RequestMapping(value = "/updateConfirm", method = RequestMethod.POST)
	public String updateConfirm(@Validated @ModelAttribute("updateForm") UpdateForm form, BindingResult bindingResult,
			Model model) {

		UserInfo beforeUser = sessionInfo.getPrevUser();

		UserInfo afterUser = new UserInfo();
		afterUser.setUserId(beforeUser.getUserId());
		afterUser.setUserName(form.getNewName());
		afterUser.setTelephone(form.getNewTel());
		afterUser.setLocation(form.getNewlocation());
		afterUser.setDepartment(form.getNewdepartment());
		afterUser.setQualification(form.getNewqualification());
		afterUser.setMerit(form.getNewmerit());
		afterUser.setDemerit(form.getNewdemerit());
		afterUser.setIndustry(form.getNewindustry());
		afterUser.setWork_location(form.getNewwork_location());
		afterUser.setFight(form.getNewfight());




		sessionInfo.setAfterUser(afterUser);

		form.setPrevName(beforeUser.getUserName());
		form.setPrevTel(beforeUser.getTelephone());

		return "updateConfirm";
	}

	@RequestMapping(value = "/updateInputBack")
	public String updateInputBack(@ModelAttribute("updateForm") UpdateForm form, Model model) {

		UserInfo afterUser = sessionInfo.getAfterUser();

		form.setUserId(afterUser.getUserId());
		form.setNewName(afterUser.getUserName());
		form.setNewTel(afterUser.getTelephone());
		form.setNewlocation(afterUser.getLocation());
		form.setNewdepartment(afterUser.getDepartment());
		form.setNewqualification(afterUser.getQualification());
		form.setNewmerit(afterUser.getMerit());
		form.setNewdemerit(afterUser.getDemerit());

		form.setNewindustry(afterUser.getIndustry());
		form.setNewwork_location(afterUser.getWork_location());
		form.setNewfight(afterUser.getFight());

		return "updateInput";
	}


	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateExecute(@Validated @ModelAttribute("updateForm") UpdateForm form, BindingResult bindingResult,
			Model model) {

		UserInfo afterUser = sessionInfo.getAfterUser();

		userInfoService.update(afterUser);

		sessionInfo.setAfterUser(null);
		sessionInfo.setPrevUser(null);

		model.addAttribute("user", sessionInfo.getLoginUser());

		return "updateResult";
	}

}
