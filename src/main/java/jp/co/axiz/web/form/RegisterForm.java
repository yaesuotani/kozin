package jp.co.axiz.web.form;

import javax.validation.constraints.NotBlank;

/*
 * 登録画面用フォーム
 */
public class RegisterForm {

	@NotBlank
	private String userId;

	@NotBlank
	private String name;

	@NotBlank
	private String password;

	private String confirmPassword;

	private String loginId;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String _userId) {
		this.userId = _userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String _password) {
		this.password = _password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String _confirmPassword) {
		this.confirmPassword = _confirmPassword;
	}

	public boolean isEmpty() {
		return (userId == null || userId.isEmpty())
				&& (name == null || name.isEmpty())
				&& (password == null || password.isEmpty());
	}
}
