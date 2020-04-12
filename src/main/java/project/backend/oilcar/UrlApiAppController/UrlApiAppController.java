package project.backend.oilcar.UrlApiAppController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projectoilcar/url")
@CrossOrigin
public class UrlApiAppController {

	@Autowired
	private UrlApiAppDao  serverdata;
	
	@GetMapping("/getall")
	public  List<UrlApiAppEntity> getAll(){
		return serverdata.findAll();
	}
	
	@GetMapping("/findOne/{id}")
	public  UrlApiAppEntity findOne(@PathVariable Integer id){
		return serverdata.findOne(id);
	}
}
