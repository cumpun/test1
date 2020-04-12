package project.backend.oilcar.Landmark.province;

import java.util.List;

import javax.persistence.OneToMany;

import project.backend.oilcar.Landmark.LandmarkModel;

public class provinceModel {

    private Integer idmasterprovince;
	private String namemasterprovince;
	
	@OneToMany
	private List<LandmarkModel> Landmarkmodel;
	
	
	public List<LandmarkModel> getLandmarkmodel() {
		return Landmarkmodel;
	}

	public void setLandmarkmodel(List<LandmarkModel> landmarkmodel) {
		Landmarkmodel = landmarkmodel;
	}

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
		return "provinceModel [idmasterprovince=" + idmasterprovince + ", namemasterprovince=" + namemasterprovince
				+ ", Landmarkmodel=" + Landmarkmodel + "]";
	}

	public provinceModel(Integer idmasterprovince, String namemasterprovince, List<LandmarkModel> landmarkmodel) {
		super();
		this.idmasterprovince = idmasterprovince;
		this.namemasterprovince = namemasterprovince;
		Landmarkmodel = landmarkmodel;
	}

	public provinceModel() {
		super();
	}
}
