package project.backend.oilcar.master.brand;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_master_brandcar_2020")
public class brandCarEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idbrandcar;
	
	@Column(name = "c_namebrand_car")
	private String namebrandcar;

	public Integer getIdbrandcar() {
		return idbrandcar;
	}

	public void setIdbrandcar(Integer idbrandcar) {
		this.idbrandcar = idbrandcar;
	}

	public String getNamebrandcar() {
		return namebrandcar;
	}

	public void setNamebrandcar(String namebrandcar) {
		this.namebrandcar = namebrandcar;
	}

	@Override
	public String toString() {
		return "brandCarEntity [idbrandcar=" + idbrandcar + ", namebrandcar=" + namebrandcar + "]";
	}

	public brandCarEntity(Integer idbrandcar, String namebrandcar) {
		super();
		this.idbrandcar = idbrandcar;
		this.namebrandcar = namebrandcar;
	}

	public brandCarEntity() {
		super();
	}
	
	

}
