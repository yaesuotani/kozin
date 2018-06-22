package jp.co.axiz.web.entity;

import java.io.Serializable;

public class UserInfo implements Serializable {

	private String userId;
	private String userName;
	private String telephone;
	private String location;
	private String department;
	private String password;
	private String confirmpassword;
	private String qualification;
	private String merit;
	private String demerit;
	private String occupations;
	private String industry;
	private String work_location;
	private String fight;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getMerit() {
		return merit;
	}

	public void setMerit(String merit) {
		this.merit = merit;
	}

	public String getDemerit() {
		return demerit;
	}

	public void setDemerit(String demerit) {
		this.demerit = demerit;
	}

	public String getOccupations() {
		return occupations;
	}

	public void setOccupations(String occupations) {
		this.occupations = occupations;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getWork_location() {
		return work_location;
	}

	public void setWork_location(String work_location) {
		this.work_location = work_location;
	}

	public String getFight() {
		return fight;
	}

	public void setFight(String fight) {
		this.fight = fight;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String _userId) {
		this.userId = _userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String _userName) {
		this.userName = _userName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public boolean isConditionsEmpty() {
		return userId == null
				&& (userName == null || userName.isEmpty())
				&& (password == null || password.isEmpty());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
}

