package nl.ycvvapp.projectreal.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.ycvvapp.projectreal.domein.Aanvrager;

@Component
public interface AanvragerRepository extends CrudRepository<Aanvrager, Long>{

}
