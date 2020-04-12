package project.backend.oilcar.Action;

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
@RequestMapping("/projectoilcar/ActionOilcar")
@CrossOrigin
public class ActionOilcarController {

	@Autowired
	private ActionOilcarRepository  serverdata;
	
	@Autowired
	private ActionOilcarJdbc  serverdataJdbc;
	
	@GetMapping("/all")
	public  List<ActionOilcarEntity> getOil(){
		return serverdata.findAll();
	}
	
	@GetMapping("/findl_iduser/{iduser}")
	public  List<ActionOilcarModel> findl_iduser(@PathVariable Integer iduser){
		return serverdataJdbc.findl_iduser(iduser);
	}
	
	@DeleteMapping("/del/{id}")
	public boolean delete(@PathVariable Long id){
		serverdata.delete(id);
		return true;
	}
	
	@GetMapping("/id/{id}")
	public  ActionOilcarEntity getid(@PathVariable Long id){
		return serverdata.findOne(id);
	}
	
	@PutMapping("/Save")
	public ActionOilcarEntity updete(@RequestBody ActionOilcarEntity data){
		return serverdata.save(data);
	}	
	
	@PostMapping("/Save")
	public ActionOilcarEntity create(@RequestBody ActionOilcarEntity data){
		System.out.println(data);
		return serverdata.save(data);
	}
	
}
