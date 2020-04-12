package project.backend.oilcar.Action;

import javax.persistence.OneToOne;

import project.backend.oilcar.master.masteroilcarEntity;
import project.backend.oilcar.master.brand.brandCarEntity;

public class ActionOilcarModel {

    private Integer idactionoilcar;
	
	private Integer iduser;
	
	private Integer idtypeOfcar;
	
	private Integer idmasterPetroleum;

	private String  location;
	
	private String  Startlocation;

	private Double  PetroleumPricesPerUnit;
	
	private Double  distance;
	
	private Double  VolumeOfPetroleumDistance;

	private Double  PriceAllTripDistance;
	
	private Integer idbrandcar;
	
	private Double let;
	
	private Double lng;

	private Double Startlet;

	private Double Startlng;

	private Boolean statusJob;
	
	//วันที่สร้าง
	private  String tsdatecreate;
 
	//วันที่update
    private String updateDateTime;

	@OneToOne
	private masteroilcarEntity masteroilcarentity;
	
	@OneToOne
	private brandCarEntity brandCarentity;

	public Integer getIdactionoilcar() {
		return idactionoilcar;
	}

	public void setIdactionoilcar(Integer idactionoilcar) {
		this.idactionoilcar = idactionoilcar;
	}

	public Integer getIduser() {
		return iduser;
	}

	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}

	public Integer getIdtypeOfcar() {
		return idtypeOfcar;
	}

	public void setIdtypeOfcar(Integer idtypeOfcar) {
		this.idtypeOfcar = idtypeOfcar;
	}

	public Integer getIdmasterPetroleum() {
		return idmasterPetroleum;
	}

	public void setIdmasterPetroleum(Integer idmasterPetroleum) {
		this.idmasterPetroleum = idmasterPetroleum;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStartlocation() {
		return Startlocation;
	}

	public void setStartlocation(String startlocation) {
		Startlocation = startlocation;
	}

	public Double getPetroleumPricesPerUnit() {
		return PetroleumPricesPerUnit;
	}

	public void setPetroleumPricesPerUnit(Double petroleumPricesPerUnit) {
		PetroleumPricesPerUnit = petroleumPricesPerUnit;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Double getVolumeOfPetroleumDistance() {
		return VolumeOfPetroleumDistance;
	}

	public void setVolumeOfPetroleumDistance(Double volumeOfPetroleumDistance) {
		VolumeOfPetroleumDistance = volumeOfPetroleumDistance;
	}

	public Double getPriceAllTripDistance() {
		return PriceAllTripDistance;
	}

	public void setPriceAllTripDistance(Double priceAllTripDistance) {
		PriceAllTripDistance = priceAllTripDistance;
	}

	public Integer getIdbrandcar() {
		return idbrandcar;
	}

	public void setIdbrandcar(Integer idbrandcar) {
		this.idbrandcar = idbrandcar;
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

	public Double getStartlet() {
		return Startlet;
	}

	public void setStartlet(Double startlet) {
		Startlet = startlet;
	}

	public Double getStartlng() {
		return Startlng;
	}

	public void setStartlng(Double startlng) {
		Startlng = startlng;
	}

	public Boolean getStatusJob() {
		return statusJob;
	}

	public void setStatusJob(Boolean statusJob) {
		this.statusJob = statusJob;
	}

	public String getTsdatecreate() {
		return tsdatecreate;
	}

	public void setTsdatecreate(String tsdatecreate) {
		this.tsdatecreate = tsdatecreate;
	}

	public String getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(String updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public masteroilcarEntity getMasteroilcarentity() {
		return masteroilcarentity;
	}

	public void setMasteroilcarentity(masteroilcarEntity masteroilcarentity) {
		this.masteroilcarentity = masteroilcarentity;
	}

	public brandCarEntity getBrandCarentity() {
		return brandCarentity;
	}

	public void setBrandCarentity(brandCarEntity brandCarentity) {
		this.brandCarentity = brandCarentity;
	}

	@Override
	public String toString() {
		return "ActionOilcarModel [idactionoilcar=" + idactionoilcar + ", iduser=" + iduser + ", idtypeOfcar="
				+ idtypeOfcar + ", idmasterPetroleum=" + idmasterPetroleum + ", location=" + location
				+ ", Startlocation=" + Startlocation + ", PetroleumPricesPerUnit=" + PetroleumPricesPerUnit
				+ ", distance=" + distance + ", VolumeOfPetroleumDistance=" + VolumeOfPetroleumDistance
				+ ", PriceAllTripDistance=" + PriceAllTripDistance + ", idbrandcar=" + idbrandcar + ", let=" + let
				+ ", lng=" + lng + ", Startlet=" + Startlet + ", Startlng=" + Startlng + ", statusJob=" + statusJob
				+ ", tsdatecreate=" + tsdatecreate + ", updateDateTime=" + updateDateTime + ", masteroilcarentity="
				+ masteroilcarentity + ", brandCarentity=" + brandCarentity + "]";
	}

	public ActionOilcarModel(Integer idactionoilcar, Integer iduser, Integer idtypeOfcar, Integer idmasterPetroleum,
			String location, String startlocation, Double petroleumPricesPerUnit, Double distance,
			Double volumeOfPetroleumDistance, Double priceAllTripDistance, Integer idbrandcar, Double let, Double lng,
			Double startlet, Double startlng, Boolean statusJob, String tsdatecreate, String updateDateTime,
			masteroilcarEntity masteroilcarentity, brandCarEntity brandCarentity) {
		super();
		this.idactionoilcar = idactionoilcar;
		this.iduser = iduser;
		this.idtypeOfcar = idtypeOfcar;
		this.idmasterPetroleum = idmasterPetroleum;
		this.location = location;
		Startlocation = startlocation;
		PetroleumPricesPerUnit = petroleumPricesPerUnit;
		this.distance = distance;
		VolumeOfPetroleumDistance = volumeOfPetroleumDistance;
		PriceAllTripDistance = priceAllTripDistance;
		this.idbrandcar = idbrandcar;
		this.let = let;
		this.lng = lng;
		Startlet = startlet;
		Startlng = startlng;
		this.statusJob = statusJob;
		this.tsdatecreate = tsdatecreate;
		this.updateDateTime = updateDateTime;
		this.masteroilcarentity = masteroilcarentity;
		this.brandCarentity = brandCarentity;
	}

	public ActionOilcarModel() {
		super();
	}
	
	
    
}
