package nl.ycvvapp.projectreal.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.ycvvapp.projectreal.domein.AfhaalAfspraak;
import nl.ycvvapp.projectreal.domein.Item;

@Component
public interface ItemRepository extends CrudRepository<Item, Long> {

}