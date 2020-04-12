package project.backend.oilcar.account.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class accountUserServicer {

	@Autowired
	private accountUserRepository  serverdata;
	
	@Autowired
	private UserJdbc  serverdataJdbc;
	
	public accountUserEntity findOneByUsername(String username) {
		return serverdata.findOneByUsername(username);

	}
	
	public List<accountUserModel> findlimitPost() {
		return serverdataJdbc.findlimitPost();

	}
	
	public accountUserModel findlimitPostIdUser(Integer i_iduser) {
		return serverdataJdbc.findlimitPostIdUser(i_iduser);

	}
	
	public int updateUserName(accountUserEntity data) {
		return serverdataJdbc.updateUserName(data);
	}
	
	public int updatePassWord(accountUserEntity data) {
		return serverdataJdbc.updatePassWord(data);
	}
	
}
