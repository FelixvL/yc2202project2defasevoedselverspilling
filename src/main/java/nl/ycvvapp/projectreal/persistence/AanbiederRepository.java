package nl.ycvvapp.projectreal.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.ycvvapp.projectreal.domein.Aanbieder;

@Component
public interface AanbiederRepository extends CrudRepository<Aanbieder, Long>{

}
