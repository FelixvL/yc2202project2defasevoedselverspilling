package nl.ycvvapp.projectreal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.ycvvapp.projectreal.domein.Aanbieder;
import nl.ycvvapp.projectreal.persistence.AanbiederService;

@RestController
public class AanbiederEndpoint {
	@Autowired
	AanbiederService as;
	
	@PostMapping("/CreateAanbieder")
	public void eersteMethode(@RequestBody Aanbieder aanbieder) {
		as.CreateAanbieder(aanbieder);
	}

}
