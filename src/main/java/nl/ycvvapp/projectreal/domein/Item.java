package nl.ycvvapp.projectreal.domein;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity 
public class Item {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	long id;
	private String name;

	@OneToMany
	List<Chat> chat1;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}