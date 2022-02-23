package nl.ycvvapp.projectreal.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AfhaalAfspraak {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	private String titel;
	private int aantalpersonen;
	private int tijdstip;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public int getAantalpersonen() {
		return aantalpersonen;
	}
	public void setAantalpersonen(int aantalpersonen) {
		this.aantalpersonen = aantalpersonen;
	}
	public int getTijdstip() {
		return tijdstip;
	}
	public void setTijdstip(int tijdstip) {
		this.tijdstip = tijdstip;
	}
	
	
	
}
