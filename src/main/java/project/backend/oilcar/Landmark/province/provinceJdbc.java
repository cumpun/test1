package project.backend.oilcar.Landmark.province;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import project.backend.oilcar.Landmark.LandmarkJdbc;

@Repository
public class provinceJdbc {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	public LandmarkJdbc landmarkJdbc;
	class provinceModelRowMapper implements RowMapper<provinceModel> {
		@Override
		public provinceModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			provinceModel data = new provinceModel();
			data.setIdmasterprovince(rs.getInt("i_master_province"));
			data.setNamemasterprovince(rs.getString("c_namemasterprovince"));
			data.setLandmarkmodel(landmarkJdbc.findprovince(data.getIdmasterprovince()));
			return data;
		}
	}
	
	public List<provinceModel> findAlllimit() {
		return jdbcTemplate.query("SELECT * FROM public.tb_master_province_2020 order by i_master_province asc limit 6 offset 0;"
				,new Object[] {}, new provinceModelRowMapper());
	}
}
