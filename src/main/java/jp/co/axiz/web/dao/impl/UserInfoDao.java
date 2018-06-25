package jp.co.axiz.web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import jp.co.axiz.web.dao.IUserInfoDao;
import jp.co.axiz.web.entity.UserInfo;

@Repository
public class UserInfoDao implements IUserInfoDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<UserInfo> findAll() {
		String sql = "SELECT * FROM user_info";

		List<UserInfo> resultList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));

		return resultList;
	}

	@Override
	public List<UserInfo> findByConditions(UserInfo userInfo) {

		List<String> condition = new ArrayList<String>();
		MapSqlParameterSource param = new MapSqlParameterSource();

		String userId = userInfo.getUserId();
		String userName = userInfo.getUserName();
		String telephone = userInfo.getTelephone();

		if(userId != null) {
			condition.add("user_id = :userId");
			param.addValue("userId", userId);
		}

		if(userName != null && !userName.isEmpty()) {
			condition.add("user_name = :userName");
			param.addValue("userName", userName);

		}

		if(telephone != null && !telephone.isEmpty()) {
			condition.add("telephone = :telephone");
			param.addValue("telephone", telephone);

		}

		String whereString = String.join(" AND ", condition.toArray(new String[]{}));

		String sql = "SELECT * FROM user_info WHERE " + whereString ;

		List<UserInfo> resultList = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));

		return resultList;
	}

	@Override
	public UserInfo findById(String id) {

		String sql = "SELECT * FROM user_info WHERE user_id = :userId";
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("userId", id);

		List<UserInfo> resultList = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));

		return resultList.isEmpty() ? null : resultList.get(0);
	}

	@Override
	public UserInfo findByIdde(String id) {

		String sql = "SELECT * FROM users WHERE user_id = :userId";
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("userId", toString());

		List<UserInfo> resultList = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));

		return resultList.isEmpty() ? null : resultList.get(0);
	}

	@Override
	public void register(UserInfo user) {
		String sql = "INSERT INTO users (user_id, user_name, password) VALUES (:userId, :userName, :password)";
		String sql1 = "INSERT INTO user_info (user_id, user_name) VALUES (:userId, :userName)";

		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("userId", user.getUserId());
		param.addValue("userName", user.getUserName());
		param.addValue("password", user.getPassword());

		KeyHolder keyHolder = new GeneratedKeyHolder();

		jdbcTemplate.update(sql, param, keyHolder, new String[] {"user_id"});
		jdbcTemplate.update(sql1, param, keyHolder, new String[] {"user_id"});

		return;
	}

	@Override
	public void update(UserInfo user) {
		String sql = "UPDATE user_info SET user_name = :userName, telephone = :telephone, location = :location, department = :department, qualification = :qualification, merit = :merit, demerit = :demerit, industry = :industry, work_location = :work_location, fight = :fight WHERE user_id = :userId";

		MapSqlParameterSource param = new MapSqlParameterSource();

		param.addValue("userName", user.getUserName());
		param.addValue("telephone", user.getTelephone());
		param.addValue("location", user.getLocation());
		param.addValue("department", user.getDepartment());
		param.addValue("qualification", user.getQualification());
		param.addValue("merit", user.getMerit());
		param.addValue("demerit", user.getDemerit());
		param.addValue("industry", user.getIndustry());
		param.addValue("work_location", user.getWork_location());
		param.addValue("fight", user.getFight());
		param.addValue("userId", user.getUserId());

		jdbcTemplate.update(sql, param);
	}

	@Override
	public void delete(String userInfo) {

		String sql = "DELETE FROM users WHERE user_id = :userId";
		String sqlde = "DELETE FROM user_info WHERE user_id = :userId";
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("userId", userInfo);

		jdbcTemplate.update(sql, param);
		jdbcTemplate.update(sqlde, param);
	}
}
