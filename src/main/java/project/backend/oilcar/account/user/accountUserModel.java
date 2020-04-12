package project.backend.oilcar.account.user;

import java.sql.Timestamp;

import javax.persistence.OneToOne;

import project.backend.oilcar.Action.ActionOilcarEntity;
import project.backend.oilcar.Action.ActionOilcarModel;

public class accountUserModel {

    private Integer iduser;
	
	private String username;
	
	private  Timestamp tsdatecreate;
	
	@OneToOne
	private ActionOilcarModel actionOilcarEntity;

	public Integer getIduser() {
		return iduser;
	}

	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Timestamp getTsdatecreate() {
		return tsdatecreate;
	}

	public void setTsdatecreate(Timestamp tsdatecreate) {
		this.tsdatecreate = tsdatecreate;
	}

	public ActionOilcarModel getActionOilcarEntity() {
		return actionOilcarEntity;
	}

	public void setActionOilcarEntity(ActionOilcarModel actionOilcarEntity) {
		this.actionOilcarEntity = actionOilcarEntity;
	}

	@Override
	public String toString() {
		return "accountUserModel [iduser=" + iduser + ", username=" + username + ", tsdatecreate=" + tsdatecreate
				+ ", actionOilcarEntity=" + actionOilcarEntity + "]";
	}

	public accountUserModel(Integer iduser, String username, Timestamp tsdatecreate,
			ActionOilcarModel actionOilcarEntity) {
		super();
		this.iduser = iduser;
		this.username = username;
		this.tsdatecreate = tsdatecreate;
		this.actionOilcarEntity = actionOilcarEntity;
	}

	public accountUserModel() {
		super();
	}
	
	
}
