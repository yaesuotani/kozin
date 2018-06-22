package jp.co.axiz.web.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.axiz.web.dao.IAdminDao;
import jp.co.axiz.web.entity.Admin;
import jp.co.axiz.web.entity.SessionInfo;

@Repository
public class AdminDao implements IAdminDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	private SessionInfo sessionInfo;

	@Override
	public Admin findByIdAndPassword(String id, String password) {
		String sql = "SELECT * FROM users WHERE user_id = :userID AND password = :password";
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("userID", id);
		param.addValue("password", password);

		List<Admin> resultList = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<Admin>(Admin.class));

		return resultList.isEmpty() ? null : resultList.get(0);
	}

	@Override
	public String delete(String id) {

		String sql = "DELETE FROM users WHERE user_id = :userId";
		String sqlde = "DELETE FROM user_info WHERE user_id = :userId";

		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("userId", id);

		sessionInfo.getLoginUser();

		jdbcTemplate.update(sql, param);
		jdbcTemplate.update(sqlde, param);
		return null;
	}

	@Override
	public Admin findById(String id) {
		String sql12 = "SELECT * FROM users WHERE user_id = :userID";
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("userID", id);

		List<Admin> resultList = jdbcTemplate.query(sql12, param, new BeanPropertyRowMapper<Admin>(Admin.class));

		return resultList.isEmpty() ? null : resultList.get(0);
	}

	public Admin deleted(Admin userID) {
		String sql = "DELETE FROM users WHERE user_id = :userId";
		String sqlde = "DELETE FROM user_info WHERE user_id = :userI";

		String id = userID.getUserID();

		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("id", id);

		jdbcTemplate.update(sql, param);
		jdbcTemplate.update(sqlde, param);
		return null;
	}

}
