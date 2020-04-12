package project.backend.oilcar.Action;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import project.backend.oilcar.master.masteroilcarDao;
import project.backend.oilcar.master.brand.brandCarRepository;

@Repository
public class ActionOilcarJdbc {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private masteroilcarDao masteroilcardao;
	
	@Autowired
	private brandCarRepository brandCarrepository;
	
	class ActionOilcarEntityRowMapper implements RowMapper<ActionOilcarModel> {
		@Override
		public ActionOilcarModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			ActionOilcarModel data = new ActionOilcarModel();
			data.setDistance(rs.getDouble("d_distance"));
			data.setIdactionoilcar(rs.getInt("i_actionoilcar"));
			data.setIdbrandcar(rs.getInt("i_idbrandcar"));
			data.setIdmasterPetroleum(rs.getInt("l_idmaster_petroleum"));
			try {
				data.setBrandCarentity(brandCarrepository.findOne(data.getIdbrandcar()));
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				data.setMasteroilcarentity(masteroilcardao.findOne(data.getIdmasterPetroleum()));;
			} catch (Exception e) {
				// TODO: handle exception
			}
			data.setIdtypeOfcar(rs.getInt("i_idtype_ofcar"));
			data.setIduser(rs.getInt("l_iduser"));
			data.setLet(rs.getDouble("d_let"));
			data.setLng(rs.getDouble("d_lng"));
			data.setStartlet(rs.getDouble("d_startlet"));
			data.setStartlng(rs.getDouble("d_startlng"));
			data.setLocation(rs.getString("c_location"));
			data.setStartlocation(rs.getString("c_startlocation"));
			data.setPetroleumPricesPerUnit(rs.getDouble("d_petroleum_prices_per_unit"));
			data.setStatusJob(rs.getBoolean("b_status_job"));
			data.setTsdatecreate(rs.getString("tsdatecreate"));
			data.setUpdateDateTime(rs.getString("update_date_time"));
			data.setPriceAllTripDistance(rs.getDouble("d_price_all_trip_distance"));
			data.setVolumeOfPetroleumDistance(rs.getDouble("d_volume_of_petroleum_distance"));
			return data;
		}
	}
	
	public List<ActionOilcarModel> findAll() {
		return jdbcTemplate.query("select * FROM public.tb_action_oilcar_2020", new ActionOilcarEntityRowMapper());
	}
	
	public ActionOilcarModel findl_iduserTimestamplimit(Integer iduser,Boolean b_status_job,java.sql.Timestamp timestamp) {
		return jdbcTemplate.queryForObject("select distinct * FROM public.tb_action_oilcar_2020 \r\n" + 
				"where l_iduser = ? and b_status_job =? \r\n" + 
				"and tsdatecreate = ? ::timestamp\r\n" + 
				"order by tsdatecreate asc limit 1 offset 0;"
				,new Object[] {iduser,b_status_job,timestamp}, new ActionOilcarEntityRowMapper());
	}
	
	public List<ActionOilcarModel> findl_iduser(Integer iduser) {
		return jdbcTemplate.query("SELECT * FROM public.tb_action_oilcar_2020 where l_iduser = ? order by i_actionoilcar asc limit 10 offset 0"
				,new Object[] {iduser}, new ActionOilcarEntityRowMapper());
	}
	
	public List<ActionOilcarModel> findl_iduserTF(Long iduser,Boolean b_status_job) {
		return jdbcTemplate.query("SELECT * FROM public.tb_action_oilcar_2020 where l_iduser = ? and b_status_job = ? order by i_actionoilcar asc limit 10 offset 0;"
				,new Object[] {iduser,b_status_job}, new ActionOilcarEntityRowMapper());
	}
}
