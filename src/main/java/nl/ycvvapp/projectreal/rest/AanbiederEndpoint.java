package nl.ycvvapp.projectreal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.ycvvapp.projectreal.persistence.AanbiederService;

@RestController
public class AanbiederEndpoint {
	@Autowired
	AanbiederService as;
	
	@GetMapping("/tomtest")
	public String eersteMethode() {
		System.out.println("testmethode tom werkt");
		as.maakNieuweAanbieder();
		return "dit is tom zijn output tweede";
	}

}
