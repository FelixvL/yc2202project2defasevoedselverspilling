package nl.ycvvapp.projectreal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.ycvvapp.projectreal.domein.AfhaalAfspraak;
import nl.ycvvapp.projectreal.domein.Item;
import nl.ycvvapp.projectreal.persistence.AfhaalAfspraakRepository;
import nl.ycvvapp.projectreal.persistence.ItemService;

@RestController
public class ItemEndpoint {

	@Autowired
	ItemService is;
	
	@GetMapping ("/marianne/eerstemethode") 
	public String eersteMethode() {
		System.out.println("testmethode 1 werkt");
		is.maakNieuwItem();
		return "dit is de output van de eerste methode";
	}
	
	@GetMapping("/marianne/getall")
	public Iterable<Item> getmeallget() {	
		return is.go();
	}
	
}