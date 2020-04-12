package project.backend.oilcar.Landmark;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class LandmarkJdbc {

	@Autowired
	JdbcTemplate jdbcTemplate;

	class LandmarkModelRowMapper implements RowMapper<LandmarkModel> {
		@Override
		public LandmarkModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			LandmarkModel data = new LandmarkModel();
			data.setIdmasterlandmark(rs.getInt("i_master_landmark"));
			data.setLet(rs.getDouble("d_let"));
			data.setLng(rs.getDouble("d_lng"));
			data.setNamemasterlandmark(rs.getString("c_namemasterlandmark"));
			data.setIdmasterprovince(rs.getInt("i_master_province"));
			return data;
		}
	}
	
	public List<LandmarkModel> findAll() {
		return jdbcTemplate.query("select * FROM public.tb_master_landmark_2020", new LandmarkModelRowMapper());
	}
	
	public List<LandmarkModel> findprovince(Integer idprovince) {
		return jdbcTemplate.query("select * FROM public.tb_master_landmark_2020 where i_master_province = ?",new Object[] {idprovince}, new LandmarkModelRowMapper());
	}
}
