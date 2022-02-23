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
	private int amount;
//	private int bestbefore;
	
//	//constructor
//	public Item (String name, int amount, int bestbefore) {
//		this.name =name;
//		this.amount = amount;
//		this.bestbefore = bestbefore;
//	}
	
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
//	public int getBestbefore() {
//		return bestbefore;
//	}
//	public void setBestbefore(int bestbefore) {
//		this.bestbefore = bestbefore;
//	}
	

}