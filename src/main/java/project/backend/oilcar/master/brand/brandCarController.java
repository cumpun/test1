package project.backend.oilcar.master.brand;

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
@RequestMapping("/projectoilcar/masterbrandcar")
@CrossOrigin
public class brandCarController {

	@Autowired
	private brandCarRepository serverdata;

	@GetMapping("/all")
	public List<brandCarEntity> getOil() {
		return serverdata.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable Integer id) {
		serverdata.delete(id);
		return true;
	}

	@GetMapping("/id/{id}")
	public brandCarEntity getid(@PathVariable Integer id) {
		return serverdata.findOne(id);
	}

	@PutMapping("/Save")
	public brandCarEntity updete(@RequestBody brandCarEntity data) {
		return serverdata.save(data);
	}

	@PostMapping("/Save")
	public brandCarEntity create(@RequestBody brandCarEntity data) {
		return serverdata.save(data);
	}
}
