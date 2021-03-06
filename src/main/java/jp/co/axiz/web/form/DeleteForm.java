package jp.co.axiz.web.form;

import javax.validation.constraints.NotNull;

/*
 * 削除画面用フォーム
 */
public class DeleteForm {

	@NotNull
	private String userId;

	private String name;

	private String tel;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String _tel) {
		this.tel = _tel;
	}
}
