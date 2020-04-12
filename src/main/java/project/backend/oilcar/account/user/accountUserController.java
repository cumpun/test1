package project.backend.oilcar.account.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projectoilcar/user")
@CrossOrigin
public class accountUserController {

	@Autowired
	private accountUserRepository serverdata;

	@Autowired
	private accountUserServicer Userservicer;

	@GetMapping("/all")
	public List<accountUserEntity> getOil() {
		return serverdata.findAll();
	}
	
	@GetMapping("/findlimitPost")
	public List<accountUserModel> findlimitPost() {
		return Userservicer.findlimitPost();
	}
	
	@GetMapping("/findlimitPostIdUser/{i_iduser}")
	public accountUserModel findlimitPostIdUser(@PathVariable Integer i_iduser) {
		return Userservicer.findlimitPostIdUser(i_iduser);
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody accountUserEntity newUser) {
		newUser.setIduser(0);
		if (Userservicer.findOneByUsername(newUser.getUsername()) != null) {
			return new ResponseEntity<String>(" username นี้มีอยู่แล้ว",HttpStatus.CONFLICT);
		}
		return new ResponseEntity<accountUserEntity>(serverdata.save(newUser), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<?> createDriver(@RequestBody accountUserEntity newUser) {
		System.out.println(newUser);
		try {
			accountUserEntity Userdata = Userservicer.findOneByUsername(newUser.getUsername());
			if (Userdata == null) {
				return new ResponseEntity<String>(" username นี้มีอยู่แล้ว",HttpStatus.CONFLICT);
			} else if (newUser.getPassword().equals(Userdata.getPassword())) {
//				Userdata.setPassword("password");
				Userdata.setPasswordRemember("password");
				return new ResponseEntity<accountUserEntity>(Userdata, HttpStatus.CREATED);
			} else {
				return null;
			}
		} catch (Exception e) {
			return new ResponseEntity<String>(" username นี้มีอยู่แล้ว",HttpStatus.CONFLICT);
		}
	}

	@DeleteMapping("/del/{id}")
	public boolean delete(@PathVariable Long id) {
		serverdata.delete(id);
		return true;
	}

	@GetMapping("/id/{id}")
	public accountUserEntity getid(@PathVariable Long id) {
		return serverdata.findOne(id);
	}

	@PutMapping("/Save")
	public accountUserEntity updete(@RequestBody accountUserEntity data) {
		return serverdata.save(data);
	}
	
	@PutMapping("/updateUserName")
	public int updateUserName(@RequestBody accountUserEntity data) {
		System.out.println(data);
		return Userservicer.updateUserName(data);
	}
	
	@PutMapping("/updatePassWord")
	public int updatePassWord(@RequestBody accountUserEntity data) {
		System.out.println(data);
		return Userservicer.updatePassWord(data);
	}

	@PostMapping("/Save")
	public accountUserEntity create(@RequestBody accountUserEntity data) {
		return serverdata.save(data);
	}
	
}
