package nl.ycvvapp.projectreal.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.ycvvapp.projectreal.domein.Aanbieder;
import nl.ycvvapp.projectreal.domein.AfhaalAfspraak;
import nl.ycvvapp.projectreal.domein.Item;
import nl.ycvvapp.projectreal.persistence.AfhaalAfspraakRepository;
import nl.ycvvapp.projectreal.persistence.ItemService;

@RestController
public class ItemEndpoint {

	@Autowired
	ItemService is;

	@GetMapping("/getitemlist")
	public Iterable<Item> getmeallget() {
		return is.getallitems();
	}
	
	@GetMapping ("/getaangebodenitemlist")
	public List<Item> getAangebodenItemlist() {
		return is.getAllAangebodenItems();
	}

	@GetMapping ("/getlistitembydate")
	public List<Item> getListItemByDate() {
		return is.getAllItemsSortedByDate();
	}
	
	
	@PostMapping("/CreateItem")
	public void createItem(@RequestBody Item item) {
		is.CreateItem(item);
	}

	@DeleteMapping("/DeleteItem")
	public void deleteItem(long id) {
		is.DeleteItem(id);
		
	}
	
	
}

