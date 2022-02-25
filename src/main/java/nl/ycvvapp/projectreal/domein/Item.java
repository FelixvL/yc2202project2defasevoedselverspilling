package nl.ycvvapp.projectreal.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Item {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	long id;
	private String name;
	private String datum;
	private int aantal;
	private String gewicht;
	//note foto moet uiteindelijk een blob worden om goed opgeslagen te worden
	private String foto;
	private boolean aangeboden;

//	@OneToMany
//	List<Chat> chat1;
	
	public boolean isAangeboden() {
		return aangeboden;
	}
	public void setAangeboden(boolean aangeboden) {
		this.aangeboden = aangeboden;
	}
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
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public int getAantal() {
		return aantal;
	}
	public void setAantal(int aantal) {
		this.aantal = aantal;
	}
	public String getGewicht() {
		return gewicht;
	}
	public void setGewicht(String gewicht) {
		this.gewicht = gewicht;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}

	
}