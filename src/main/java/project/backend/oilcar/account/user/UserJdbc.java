package project.backend.oilcar.account.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import project.backend.oilcar.Action.ActionOilcarJdbc;

@Repository
public class UserJdbc {
	@Autowired
	JdbcTemplate jdbcTemplate;

	class accountUserEntityRowMapper implements RowMapper<accountUserEntity> {
		@Override
		public accountUserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
			accountUserEntity data = new accountUserEntity();
			data.setIdcard(rs.getString("c_idcard"));
			data.setIduser(rs.getInt("i_iduser"));
			data.setPassword(rs.getString("c_password"));
			data.setPasswordRemember(rs.getString("c_password_remember"));
			data.setTsdatecreate(rs.getTimestamp("tsdatecreate"));
			data.setUpdateDateTime(rs.getTimestamp("update_date_time"));
			data.setUsername(rs.getString("c_username"));
			data.setImg(rs.getString("c_img"));
			return data;
		}
	}
	
	@Autowired
	private ActionOilcarJdbc actionOilcarJdbc;
	
	class accountUserModelRowMapper implements RowMapper<accountUserModel> {
		@Override
		public accountUserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			accountUserModel data = new accountUserModel();
			data.setIduser(rs.getInt("i_iduser"));
			data.setTsdatecreate(rs.getTimestamp("tsdatecreate"));
			data.setUsername(rs.getString("c_username"));
			data.setActionOilcarEntity(actionOilcarJdbc.findl_iduserTimestamplimit(data.getIduser(),true,data.getTsdatecreate()));
			return data;
		}
	}
	
	public List<accountUserEntity> findAll() {
		return jdbcTemplate.query("SELECT * FROM public.maintaince_upload_file_2018 ORDER BY id ASC ", new accountUserEntityRowMapper());
	}
	
	public List<accountUserModel> findlimitPost() {
		return jdbcTemplate.query("SELECT tbuser.i_iduser,tbuser.c_username,tbaction.tsdatecreate FROM public.tb_action_oilcar_2020 tbaction \r\n" + 
				",public.tb_account_user_2020 tbuser \r\n" + 
				"where tbaction.l_iduser = tbuser.i_iduser \r\n" + 
				"and tbaction.b_status_job = true\r\n" + 
				"order by tbaction.tsdatecreate desc limit 10 offset 0", new accountUserModelRowMapper());
	}
	
	public accountUserModel findlimitPostIdUser(Integer i_iduser) {
		return jdbcTemplate.queryForObject("SELECT tbuser.i_iduser,tbuser.c_username,tbaction.tsdatecreate FROM public.tb_action_oilcar_2020 tbaction \r\n" + 
				",public.tb_account_user_2020 tbuser \r\n" + 
				"where tbaction.l_iduser = ? \r\n" + 
				"and tbaction.b_status_job = true limit 0 offset 1"
			     ,new Object[] { i_iduser}, new accountUserModelRowMapper());
	}
	
	public int updateUserName(accountUserEntity data) {
		return jdbcTemplate.update("UPDATE public.tb_account_user_2020\r\n" + 
				"SET c_username=?\r\n" + 
				"WHERE i_iduser=?",
				new Object[] { data.getUsername(),data.getIduser()});
	}
	
	public int updatePassWord(accountUserEntity data) {
		return jdbcTemplate.update("UPDATE public.tb_account_user_2020\r\n" + 
				"SET c_password=?\r\n" + 
				"WHERE i_iduser=?",
				new Object[] { data.getPassword(),data.getIduser()});
	}
	
	
}
