package controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Front.Details;
import service.Detail_service;

@RestController
public class mycontroler {
	@Autowired
	private Detail_service  detail_service; 
	
	@PostMapping("/bfhl")
	public Details add_details(@RequestBody Details details)
	{
		return this.detail_service.add_details(details);
	}
}
