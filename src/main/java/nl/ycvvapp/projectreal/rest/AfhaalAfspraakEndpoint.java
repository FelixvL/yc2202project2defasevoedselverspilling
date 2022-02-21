package nl.ycvvapp.projectreal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.ycvvapp.projectreal.persistence.AfhaalAfspraakService;

@RestController
public class AfhaalAfspraakEndpoint {
	@Autowired    // Dependency Injection
	AfhaalAfspraakService aas;
	
	@GetMapping("/felixtest")
	public String eersteMethode() {
		System.out.println("testmethode felix werkt");
		aas.maakNieuweAfhaalAfspraak();
		return "dit is mijn output";
	}
	@GetMapping("/voorraad/biologisch/afhaal")
	public String tweedeMethode() {	
		aas.maakNieuweAfhaalAfspraak();
		System.out.println("testmethode felix werkt");
		return "dit is mijn output";
	}
}
