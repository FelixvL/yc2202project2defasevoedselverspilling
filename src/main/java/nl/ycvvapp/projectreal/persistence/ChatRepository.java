package nl.ycvvapp.projectreal.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.ycvvapp.projectreal.domein.Chat;

@Component
public interface ChatRepository extends CrudRepository<Chat, Long>{

}