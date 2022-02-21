package nl.ycvvapp.projectreal.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aanbieder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	String naam;
}
