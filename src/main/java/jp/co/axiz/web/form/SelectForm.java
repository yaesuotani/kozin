package jp.co.axiz.web.form;

/*
 * 検索画面用フォーム
 */
public class SelectForm {

	private String userId;

	private String name;

	private String tel;

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

	public String getTel() {
		return tel;
	}

	public void setTel(String _tel) {
		this.tel = _tel;
	}

	public boolean isEmpty() {
		return userId == null
				&& (name == null || name.isEmpty());
	}
}
