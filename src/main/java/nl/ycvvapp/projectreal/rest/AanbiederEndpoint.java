package nl.ycvvapp.projectreal.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AanbiederEndpoint {
	
	@GetMapping("/tomtest")
	public String eersteMethode() {
		System.out.println("testmethode tom werkt");
		return "dit is tom zijn output tweede";
	}

}
