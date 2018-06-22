package jp.co.axiz.web.service;

import java.util.List;

import jp.co.axiz.web.entity.UserInfo;

public interface IUserInfoService {

	public List<UserInfo> find(UserInfo userInfo);
	public UserInfo findById(String id);
	public String insert(UserInfo userInfo);
	public String delete(String userInfo);
	public String update(UserInfo userInfo);
}
