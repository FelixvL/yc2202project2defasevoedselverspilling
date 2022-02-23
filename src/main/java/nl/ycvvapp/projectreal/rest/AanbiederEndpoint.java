package nl.ycvvapp.projectreal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		System.out.println("De aanbieder is toegevoegd" + aanbieder.getNaam());
	}

}
