package nl.ycvvapp.projectreal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.ycvvapp.projectreal.domein.Aanvrager;
import nl.ycvvapp.projectreal.persistence.AanvragerService;

@RestController
public class AanvragerEndpoint {
	@Autowired
	AanvragerService aas;
	
//	@Autowired
//	Aanvrager aa;
	
	@GetMapping("/jesseTest")
	public void herewego() {
		aas.maakNieuweAanbieder();
		System.out.println("here we goo jesse");
	}
	
	@GetMapping("/returntype2")
	public Aanvrager aanvrager (){
		Aanvrager aa = new Aanvrager();
		aa.setAantalPersonen(10);
		aa.setBedrijfsnaam("macDonalds");
		aa.setTitel("titeltjes");
		
		return aa;
	}
}
