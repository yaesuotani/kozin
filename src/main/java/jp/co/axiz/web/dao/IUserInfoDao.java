package jp.co.axiz.web.dao;

import java.util.List;

import jp.co.axiz.web.entity.UserInfo;

public interface IUserInfoDao {

	public List<UserInfo> findAll();
	public List<UserInfo> findByConditions(UserInfo userInfo);
	public UserInfo findById(String id);
	public UserInfo findByIdde(String id);
	public void register(UserInfo user);
	public void delete(String userInfo);
	public void update(UserInfo user);
}
