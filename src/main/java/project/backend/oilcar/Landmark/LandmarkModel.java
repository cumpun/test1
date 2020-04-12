package project.backend.oilcar.Landmark;

public class LandmarkModel {

    private Integer idmasterlandmark;
 	
	private String namemasterlandmark;
	
	private Double let;
	
	private Double lng;

	private Integer idmasterprovince;
	
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

	public LandmarkModel(Integer idmasterlandmark, Integer idmasterprovince, String namemasterlandmark, Double let,
			Double lng) {
		super();
		this.idmasterlandmark = idmasterlandmark;
		this.idmasterprovince = idmasterprovince;
		this.namemasterlandmark = namemasterlandmark;
		this.let = let;
		this.lng = lng;
	}

	public LandmarkModel() {
		super();
	}
}
