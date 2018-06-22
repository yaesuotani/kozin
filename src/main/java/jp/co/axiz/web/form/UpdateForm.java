package jp.co.axiz.web.form;

import javax.validation.constraints.NotNull;

/*
 * 更新画面用フォーム
 */
public class UpdateForm {

	@NotNull
	private String userId;

	private String newName;

	private String newTel;

	private String prevName;

	private String prevTel;

	private String newlocation;
	private String newdepartment;
	private String newconfirmpassword;
	private String newqualification;
	private String newmerit;
	private String newdemerit;
	private String newoccupations;
	private String newindustry;
	private String newwork_location;
	private String newfight;

	private String prevlocation;
	private String prevdepartment;
	private String prevconfirmpassword;
	private String prevqualification;
	private String prevmerit;
	private String prevdemerit;
	private String prevoccupations;
	private String previndustry;
	private String prevwork_location;
	private String prevfight;


	public String getPrevlocation() {
		return prevlocation;
	}

	public void setPrevlocation(String prevlocation) {
		this.prevlocation = prevlocation;
	}

	public String getPrevdepartment() {
		return prevdepartment;
	}

	public void setPrevdepartment(String prevdepartment) {
		this.prevdepartment = prevdepartment;
	}

	public String getPrevconfirmpassword() {
		return prevconfirmpassword;
	}

	public void setPrevconfirmpassword(String prevconfirmpassword) {
		this.prevconfirmpassword = prevconfirmpassword;
	}

	public String getPrevqualification() {
		return prevqualification;
	}

	public void setPrevqualification(String prevqualification) {
		this.prevqualification = prevqualification;
	}

	public String getPrevmerit() {
		return prevmerit;
	}

	public void setPrevmerit(String prevmerit) {
		this.prevmerit = prevmerit;
	}

	public String getPrevdemerit() {
		return prevdemerit;
	}

	public void setPrevdemerit(String prevdemerit) {
		this.prevdemerit = prevdemerit;
	}

	public String getPrevoccupations() {
		return prevoccupations;
	}

	public void setPrevoccupations(String prevoccupations) {
		this.prevoccupations = prevoccupations;
	}

	public String getPrevindustry() {
		return previndustry;
	}

	public void setPrevindustry(String previndustry) {
		this.previndustry = previndustry;
	}

	public String getPrevwork_location() {
		return prevwork_location;
	}

	public void setPrevwork_location(String prevwork_location) {
		this.prevwork_location = prevwork_location;
	}

	public String getPrevfight() {
		return prevfight;
	}

	public void setPrevfight(String prevfight) {
		this.prevfight = prevfight;
	}

	public String getUserId() {
		return userId;
	}

	public String getNewlocation() {
		return newlocation;
	}

	public void setNewlocation(String newlocation) {
		this.newlocation = newlocation;
	}

	public String getNewdepartment() {
		return newdepartment;
	}

	public void setNewdepartment(String newdepartment) {
		this.newdepartment = newdepartment;
	}

	public String getNewconfirmpassword() {
		return newconfirmpassword;
	}

	public void setNewconfirmpassword(String newconfirmpassword) {
		this.newconfirmpassword = newconfirmpassword;
	}

	public String getNewqualification() {
		return newqualification;
	}

	public void setNewqualification(String newqualification) {
		this.newqualification = newqualification;
	}

	public String getNewmerit() {
		return newmerit;
	}

	public void setNewmerit(String newmerit) {
		this.newmerit = newmerit;
	}

	public String getNewdemerit() {
		return newdemerit;
	}

	public void setNewdemerit(String newdemerit) {
		this.newdemerit = newdemerit;
	}

	public String getNewoccupations() {
		return newoccupations;
	}

	public void setNewoccupations(String newoccupations) {
		this.newoccupations = newoccupations;
	}

	public String getNewindustry() {
		return newindustry;
	}

	public void setNewindustry(String newindustry) {
		this.newindustry = newindustry;
	}

	public String getNewwork_location() {
		return newwork_location;
	}

	public void setNewwork_location(String newwork_location) {
		this.newwork_location = newwork_location;
	}

	public String getNewfight() {
		return newfight;
	}

	public void setNewfight(String newfight) {
		this.newfight = newfight;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNewName() {
		return newName;
	}

	public void setNewName(String _newName) {
		this.newName = _newName;
	}

	public String getNewTel() {
		return newTel;
	}

	public void setNewTel(String _newTel) {
		this.newTel = _newTel;
	}

	public String getPrevName() {
		return prevName;
	}

	public void setPrevName(String _prevName) {
		this.prevName = _prevName;
	}

	public String getPrevTel() {
		return prevTel;
	}

	public void setPrevTel(String _prevTel) {
		this.prevTel = _prevTel;
	}

	public boolean hasRequiredError() {
		return (newName == null || newName.isEmpty());

	}
}
