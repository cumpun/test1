package project.backend.oilcar.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projectoilcar/masterpetroleum")
@CrossOrigin
public class masteroilcarController {

	@Autowired
	private masteroilcarDao  serverdata;
	
	@GetMapping("/all")
	public  List<masteroilcarEntity> getOil(){
		return serverdata.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable Integer id){
		serverdata.delete(id);
		return true;
	}
	
	@GetMapping("/id/{id}")
	public  masteroilcarEntity getid(@PathVariable Integer id){
		return serverdata.findOne(id);
	}
	
	@PutMapping("/Save")
	public masteroilcarEntity updete(@RequestBody masteroilcarEntity data){
		return serverdata.save(data);
	}	
	
	@PostMapping("/Save")
	public masteroilcarEntity create(@RequestBody masteroilcarEntity data){
		return serverdata.save(data);
	}
	
}
