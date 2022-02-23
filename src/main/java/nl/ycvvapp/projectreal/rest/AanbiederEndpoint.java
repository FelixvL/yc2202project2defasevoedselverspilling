package nl.ycvvapp.projectreal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import nl.ycvvapp.projectreal.persistence.AanbiederService;

@RestController
public class AanbiederEndpoint {
	@Autowired
	AanbiederService as;
	
	@GetMapping("/var2/{qqqaaa}")
	public String eersteMethode(@PathVariable("qqqaaa") String abc) {
		System.out.println("De aanbieder "+ abc + " is toegevoegd");
		as.maakNieuweAanbieder(abc);
		return abc +" toegevoegd";
	}

}
