package jp.co.axiz.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.axiz.web.dao.impl.UserInfoDao;
import jp.co.axiz.web.entity.UserInfo;
import jp.co.axiz.web.service.IUserInfoService;

@Service
@Transactional
public class UserInfoService implements IUserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public List<UserInfo> find(UserInfo userInfo) {

		if (userInfo.isConditionsEmpty()) {
			return userInfoDao.findAll();
		} else {
			return userInfoDao.findByConditions(userInfo);
		}
	}

	@Override
	public UserInfo findById(String id) {
		return userInfoDao.findById(id);
	}

	@Override
	public String insert(UserInfo userInfo) {
		userInfoDao.register(userInfo);
		return null;

	}

	@Override
	public String update(UserInfo userInfo) {
		userInfoDao.update(userInfo);
		return null;
	}

	@Override
	public String delete(String userInfo) {
		userInfoDao.delete(userInfo);
		return null;
	}

	public UserInfo findByIdde(String userId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
