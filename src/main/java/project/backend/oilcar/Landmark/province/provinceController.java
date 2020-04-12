package project.backend.oilcar.Landmark.province;

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
@RequestMapping("/projectoilcar/province")
@CrossOrigin
public class provinceController {

	@Autowired
	private provinceDao serverdata;

	@Autowired
	private provinceJdbc provincejdbc;
	
	@GetMapping("/all")
	public List<provinceEntity> getOil() {
		return serverdata.findAll();
	}
	
	@GetMapping("/findAlllimit")
	public List<provinceModel> findAlllimit() {
		return provincejdbc.findAlllimit();
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable Integer id) {
		serverdata.delete(id);
		return true;
	}

	@GetMapping("/id/{id}")
	public provinceEntity getid(@PathVariable Integer id) {
		return serverdata.findOne(id);
	}

	@PutMapping("/Save")
	public provinceEntity updete(@RequestBody provinceEntity data) {
		return serverdata.save(data);
	}

	@PostMapping("/Save")
	public provinceEntity create(@RequestBody provinceEntity data) {
		return serverdata.save(data);
	}
}
