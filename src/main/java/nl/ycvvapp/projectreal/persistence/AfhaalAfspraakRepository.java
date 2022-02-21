package nl.ycvvapp.projectreal.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.ycvvapp.projectreal.domein.AfhaalAfspraak;

@Component
public interface AfhaalAfspraakRepository extends CrudRepository<AfhaalAfspraak, Long> {

}
