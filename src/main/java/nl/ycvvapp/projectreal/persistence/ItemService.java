
package nl.ycvvapp.projectreal.persistence;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycvvapp.projectreal.domein.Aanbieder;
import nl.ycvvapp.projectreal.domein.AfhaalAfspraak;
import nl.ycvvapp.projectreal.domein.Item;

@Service
public class ItemService {
	@Autowired
	ItemRepository ir;

	public Iterable<Item> getallitems() {
		 return ir.findAll();
	}
	
	public void CreateItem(Item item) {
		ir.save(item);
	}
	
	public void DeleteItem(long id) {
        ir.deleteById(id);
        }
	
	public List<Item> getAllAangebodenItems() {
		 return ir.findByAangebodenTrue();
	
	}
	
	
		
}	

