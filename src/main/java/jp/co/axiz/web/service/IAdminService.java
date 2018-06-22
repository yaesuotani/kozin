package jp.co.axiz.web.service;

import jp.co.axiz.web.entity.Admin;

public interface IAdminService {

	public Admin authentication(String id, String password);

	public Admin idikeru(String id);

	public String delete(String id);
}
