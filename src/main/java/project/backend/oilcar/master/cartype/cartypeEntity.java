package project.backend.oilcar.master.cartype;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_test_master_type_ofcar_2020")
public class cartypeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "i_idtype_ofcar")
	private Integer idtypeOfcar;
	
	@Column(name = "c_namecartype")
	private String namecarOftype;

	public Integer getIdtypeOfcar() {
		return idtypeOfcar;
	}

	public void setIdtypeOfcar(Integer idtypeOfcar) {
		this.idtypeOfcar = idtypeOfcar;
	}

	public String getNamecarOftype() {
		return namecarOftype;
	}

	public void setNamecarOftype(String namecarOftype) {
		this.namecarOftype = namecarOftype;
	}

	@Override
	public String toString() {
		return "cartypeEntity [idtypeOfcar=" + idtypeOfcar + ", namecarOftype=" + namecarOftype + "]";
	}

	public cartypeEntity(Integer idtypeOfcar, String namecarOftype) {
		super();
		this.idtypeOfcar = idtypeOfcar;
		this.namecarOftype = namecarOftype;
	}

	public cartypeEntity() {
		super();
	}
	
	
}
