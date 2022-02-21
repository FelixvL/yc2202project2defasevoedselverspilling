package nl.ycvvapp.projectreal.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AfhaalAfspraakEndpoint {

	@GetMapping("/felixtest")
	public String eersteMethode() {
		System.out.println("testmethode felix werkt");
		return "dit is mijn output";
	}
}
