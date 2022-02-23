
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
	

	public Iterable<Item> getallitems() {
		 Iterable<Item> items = ir.findAll();
		 return items;
	}
		
}	

