package project.backend.oilcar.UrlApiAppController;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_test_master_urlapiapp_2020")
public class UrlApiAppEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "i_master_url")
	private Integer idurl;
	
	@Column(name = "c_url")
	private String url;

	public Integer getIdurl() {
		return idurl;
	}

	public void setIdurl(Integer idurl) {
		this.idurl = idurl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "UrlApiAppEntity [idurl=" + idurl + ", url=" + url + "]";
	}

	public UrlApiAppEntity(Integer idurl, String url) {
		super();
		this.idurl = idurl;
		this.url = url;
	}

	public UrlApiAppEntity() {
		super();
	}
	
	
}
