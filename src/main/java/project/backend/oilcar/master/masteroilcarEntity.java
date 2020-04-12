package project.backend.oilcar.master;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_master_petroleum_2020")
public class masteroilcarEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "i_master_petroleum")
	private Integer idmasterPetroleum;
	
	@Column(name = "c_namemasteroilcar")
	private String namemasteroilcar;

	public Integer getidmasterPetroleum() {
		return idmasterPetroleum;
	}

	public void setidmasterPetroleum(Integer idmasterPetroleum) {
		this.idmasterPetroleum = idmasterPetroleum;
	}

	public String getNamemasteroilcar() {
		return namemasteroilcar;
	}

	public void setNamemasteroilcar(String namemasteroilcar) {
		this.namemasteroilcar = namemasteroilcar;
	}

	@Override
	public String toString() {
		return "masteroilcarEntity [idmasterPetroleum=" + idmasterPetroleum + ", namemasteroilcar=" + namemasteroilcar
				+ "]";
	}

	public masteroilcarEntity(Integer idmasterPetroleum, String namemasteroilcar) {
		super();
		this.idmasterPetroleum = idmasterPetroleum;
		this.namemasteroilcar = namemasteroilcar;
	}

	public masteroilcarEntity() {
		super();
	}
	
	
}
