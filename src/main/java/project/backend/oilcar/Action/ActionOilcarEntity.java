package project.backend.oilcar.Action;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_test_action_oilcar_2020")
public class ActionOilcarEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "i_actionoilcar")
	private Integer idactionoilcar;
	
	@Column(name = "l_iduser")
	private Integer iduser;
	
	@Column(name = "i_idtype_ofcar")
	private Integer idtypeOfcar;
	
	@Column(name = "l_idmaster_petroleum")
	private Integer idmasterPetroleum;
	
	@Column(name = "c_location")
	private String  location;
	
	@Column(name = "c_Startlocation")
	private String  Startlocation;
	
	@Column(name = "d_PetroleumPricesPerUnit")
	private Double  PetroleumPricesPerUnit;
	
	@Column(name = "d_distance")
	private Double  distance;
	
	@Column(name = "d_VolumeOfPetroleumDistance")
	private Double  VolumeOfPetroleumDistance;
	
	@Column(name = "d_PriceAllTripDistance")
	private Double  PriceAllTripDistance;
	
	@Column(name = "i_idbrandcar")
	private Integer idbrandcar;
	
	@Column(name = "d_let")
	private Double let;
	
	@Column(name = "d_lng")
	private Double lng;
	
	@Column(name = "d_startlet")
	private Double Startlet;
	
	@Column(name = "d_startlng")
	private Double Startlng;
	
	@Column(name = "b_status_job")
	private Boolean statusJob;
	
	//วันที่สร้าง
	@CreationTimestamp
	@Column
	private  java.sql.Timestamp tsdatecreate;
 
	//วันที่update
    @UpdateTimestamp
    @Column
    private java.sql.Timestamp updateDateTime;

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

	public Boolean getStatusJob() {
		return statusJob;
	}

	public void setStatusJob(Boolean statusJob) {
		this.statusJob = statusJob;
	}

	public java.sql.Timestamp getTsdatecreate() {
		return tsdatecreate;
	}

	public void setTsdatecreate(java.sql.Timestamp tsdatecreate) {
		this.tsdatecreate = tsdatecreate;
	}

	public java.sql.Timestamp getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(java.sql.Timestamp updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public Double getPriceAllTripDistance() {
		return PriceAllTripDistance;
	}

	public void setPriceAllTripDistance(Double priceAllTripDistance) {
		PriceAllTripDistance = priceAllTripDistance;
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
	
	public String getStartlocation() {
		return Startlocation;
	}

	public void setStartlocation(String startlocation) {
		Startlocation = startlocation;
	}

	@Override
	public String toString() {
		return "ActionOilcarEntity [idactionoilcar=" + idactionoilcar + ", iduser=" + iduser + ", idtypeOfcar="
				+ idtypeOfcar + ", idmasterPetroleum=" + idmasterPetroleum + ", location=" + location
				+ ", Startlocation=" + Startlocation + ", PetroleumPricesPerUnit=" + PetroleumPricesPerUnit
				+ ", distance=" + distance + ", VolumeOfPetroleumDistance=" + VolumeOfPetroleumDistance
				+ ", PriceAllTripDistance=" + PriceAllTripDistance + ", idbrandcar=" + idbrandcar + ", let=" + let
				+ ", lng=" + lng + ", Startlet=" + Startlet + ", Startlng=" + Startlng + ", statusJob=" + statusJob
				+ ", tsdatecreate=" + tsdatecreate + ", updateDateTime=" + updateDateTime + "]";
	}
	
	public ActionOilcarEntity(Integer idactionoilcar, Integer iduser, Integer idtypeOfcar, Integer idmasterPetroleum,
			String location, String startlocation, Double petroleumPricesPerUnit, Double distance,
			Double volumeOfPetroleumDistance, Double priceAllTripDistance, Integer idbrandcar, Double let, Double lng,
			Double startlet, Double startlng, Boolean statusJob, Timestamp tsdatecreate, Timestamp updateDateTime) {
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
	}

	public ActionOilcarEntity() {
		super();
	}
    
    
}
