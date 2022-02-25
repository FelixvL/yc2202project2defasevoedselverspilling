package nl.ycvvapp.projectreal.persistence;

import nl.ycvvapp.projectreal.domein.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends CrudRepository<User, Long>{

}
