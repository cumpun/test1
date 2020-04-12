package project.backend.oilcar.Landmark.province;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_master_province_2020")
public class provinceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "i_master_province")
	private Integer idmasterprovince;
	
	@Column(name = "c_namemasterprovince")
	private String namemasterprovince;

	public Integer getIdmasterprovince() {
		return idmasterprovince;
	}

	public void setIdmasterprovince(Integer idmasterprovince) {
		this.idmasterprovince = idmasterprovince;
	}

	public String getNamemasterprovince() {
		return namemasterprovince;
	}

	public void setNamemasterprovince(String namemasterprovince) {
		this.namemasterprovince = namemasterprovince;
	}

	@Override
	public String toString() {
		return "provinceEntity [idmasterprovince=" + idmasterprovince + ", namemasterprovince=" + namemasterprovince
				+ "]";
	}

	public provinceEntity(Integer idmasterprovince, String namemasterprovince) {
		super();
		this.idmasterprovince = idmasterprovince;
		this.namemasterprovince = namemasterprovince;
	}

	public provinceEntity() {
		super();
	}
	
	
}
