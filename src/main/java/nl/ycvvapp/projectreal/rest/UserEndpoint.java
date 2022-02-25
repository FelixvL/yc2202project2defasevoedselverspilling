package nl.ycvvapp.projectreal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.ycvvapp.projectreal.domein.User;
import nl.ycvvapp.projectreal.persistence.UserService;

@RestController
public class UserEndpoint {

	@Autowired
	UserService as;
	
	@PostMapping("/CreateUser")
	public void eersteMethode(@RequestBody User user) {
		as.CreateUser(user);
	}
}
