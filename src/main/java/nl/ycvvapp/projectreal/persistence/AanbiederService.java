package nl.ycvvapp.projectreal.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycvvapp.projectreal.domein.Aanbieder;

@Service
public class AanbiederService {
	@Autowired
	AanbiederRepository ar;
	
	public void maakNieuweAanbieder() {
		Aanbieder a = new Aanbieder();
		a.naam = "mijn naam";
		ar.save(a);
		System.out.println("Ik ben een nieuwe aanbieder");
	}
}