package nl.ycvvapp.projectreal.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AanvragerEndpoint {
	@GetMapping("/jesseTest")
	public void herewego() {
		System.out.println("here we goo jesse");
	}
}
