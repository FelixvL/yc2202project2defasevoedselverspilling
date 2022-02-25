package nl.ycvvapp.projectreal.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.ycvvapp.projectreal.domein.Aanvrager;
import nl.ycvvapp.projectreal.domein.User;
import nl.ycvvapp.projectreal.persistence.AanvragerService;
import nl.ycvvapp.projectreal.persistence.UserService;

@RestController
public class AanvragerEndpoint {
	@Autowired
	AanvragerService aas;
	@Autowired
	UserService us;
	
	@GetMapping("/aanvrager/user/{userid}")
	public Aanvrager GetUserAanvrager(@PathVariable("userid") long userid) {
		Optional<User> optional = us.FindUserById(userid);
		if(optional.isPresent()) {
			return optional.get().getAanvrager();
		}else {
			return null;
		}
	}
	
	@PostMapping("/CreateAanvrager")
	public void CreateAanvrager(@RequestBody Aanvrager aanvrager) {
		aas.CreateAanvrager(aanvrager);
	}

}
