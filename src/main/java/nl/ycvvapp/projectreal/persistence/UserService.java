package nl.ycvvapp.projectreal.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycvvapp.projectreal.domein.User;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;
	
	public void CreateUser(User user) {
		ur.save(user);
	}
	
	public Optional<User> FindUserById(long userid) {
		return ur.findById(userid);
	}
}
