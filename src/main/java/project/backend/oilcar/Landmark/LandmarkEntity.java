package project.backend.oilcar.Landmark;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_test_master_landmark_2020")
public class LandmarkEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "i_master_landmark")
	private Integer idmasterlandmark;
	
	@Column(name = "i_master_province")
	private Integer idmasterprovince;
	
	@Column(name = "c_namemasterlandmark")
	private String namemasterlandmark;
	
	@Column(name = "d_let")
	private Double let;
	
	@Column(name = "d_lng")
	private Double lng;

	public Integer getIdmasterlandmark() {
		return idmasterlandmark;
	}

	public void setIdmasterlandmark(Integer idmasterlandmark) {
		this.idmasterlandmark = idmasterlandmark;
	}

	public Integer getIdmasterprovince() {
		return idmasterprovince;
	}

	public void setIdmasterprovince(Integer idmasterprovince) {
		this.idmasterprovince = idmasterprovince;
	}

	public String getNamemasterlandmark() {
		return namemasterlandmark;
	}

	public void setNamemasterlandmark(String namemasterlandmark) {
		this.namemasterlandmark = namemasterlandmark;
	}

	public Double getLet() {
		return let;
	}

	public void setLet(Double let) {
		this.let = let;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	@Override
	public String toString() {
		return "LandmarkEntity [idmasterlandmark=" + idmasterlandmark + ", idmasterprovince=" + idmasterprovince
				+ ", namemasterlandmark=" + namemasterlandmark + ", let=" + let + ", lng=" + lng + "]";
	}

	public LandmarkEntity(Integer idmasterlandmark, Integer idmasterprovince, String namemasterlandmark, Double let,
			Double lng) {
		super();
		this.idmasterlandmark = idmasterlandmark;
		this.idmasterprovince = idmasterprovince;
		this.namemasterlandmark = namemasterlandmark;
		this.let = let;
		this.lng = lng;
	}

	public LandmarkEntity() {
		super();
	}
	
	
	
}
