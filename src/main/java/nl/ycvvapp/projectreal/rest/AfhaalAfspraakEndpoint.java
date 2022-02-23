package nl.ycvvapp.projectreal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import nl.ycvvapp.projectreal.domein.AfhaalAfspraak;
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
	@GetMapping("/var/{qqqaaa}")
	public String derdeMethode(@PathVariable("qqqaaa") String abc) {	
		System.out.println("dit is variable"+abc);
		aas.methodeMetEigenInvulling(abc);
		return "dit is mijn output";
	}
	@GetMapping("/returntype")
	public AfhaalAfspraak derdeMethode() {	
		return aas.geefEenAfspraak();
	}
	@GetMapping("/getmeall")
	public Iterable<AfhaalAfspraak> getmeall() {	
		return aas.go();
	}
}
