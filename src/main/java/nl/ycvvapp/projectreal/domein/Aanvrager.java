package nl.ycvvapp.projectreal.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Aanvrager {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	private String postCode;
	private String huisNummer;
	
	@JsonIgnore
	@OneToOne(mappedBy = "aanvrager")
	private User user;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getHuisNummer() {
		return huisNummer;
	}
	public void setHuisNummer(String huisNummer) {
		this.huisNummer = huisNummer;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
