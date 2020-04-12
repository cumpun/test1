package project.backend.oilcar.account.user;

import java.sql.Timestamp;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_test_account_user_2020")
public class accountUserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "i_iduser")
	private Integer iduser;
	
	@Column(name = "c_username")
	private String username;
	
	@Column(name = "c_password")
	private String password;

	@Column(name = "c_img")
	private String img;
	
	@Column(name = "c_password_remember")
	private String passwordRemember;
	
	@Column(name = "c_idcard")
	private String idcard;
	
	//วันที่สร้าง
	@CreationTimestamp
	@Column
	private  java.sql.Timestamp tsdatecreate;
 
	//วันที่update
    @UpdateTimestamp
    @Column
    private java.sql.Timestamp updateDateTime;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordRemember() {
		return passwordRemember;
	}

	public void setPasswordRemember(String passwordRemember) {
		this.passwordRemember = passwordRemember;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
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
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "accountUserEntity [iduser=" + iduser + ", username=" + username + ", password=" + password + ", img="
				+ img + ", passwordRemember=" + passwordRemember + ", idcard=" + idcard + ", tsdatecreate="
				+ tsdatecreate + ", updateDateTime=" + updateDateTime + "]";
	}
	
	public accountUserEntity(Integer iduser, String username, String password, String img, String passwordRemember,
			String idcard, Timestamp tsdatecreate, Timestamp updateDateTime) {
		super();
		this.iduser = iduser;
		this.username = username;
		this.password = password;
		this.img = img;
		this.passwordRemember = passwordRemember;
		this.idcard = idcard;
		this.tsdatecreate = tsdatecreate;
		this.updateDateTime = updateDateTime;
	}

	public accountUserEntity() {
		super();
	}
    
    
}
