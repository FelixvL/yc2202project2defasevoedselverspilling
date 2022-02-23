
package nl.ycvvapp.projectreal.persistence;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycvvapp.projectreal.domein.AfhaalAfspraak;
import nl.ycvvapp.projectreal.domein.Item;

@Service
public class ItemService {
	@Autowired
	ItemRepository ir;
	
	public void maakNieuwItem() {
		Item item1 = new Item();
		item1.setName("Bloemkool");
		Item item2 = new Item();
		item2.setName("Bloemkool");
		Item item3 = new Item();
		item3.setName("Bloemkool");
		ir.save(item1);
		ir.save(item2);
		ir.save(item3);
		System.out.println("Nieuwe items toegevoegd");
	}

	public Iterable<Item> go() {
		 Iterable<Item> abcdef = ir.findAll();
		 return abcdef;
	}
		
}	

