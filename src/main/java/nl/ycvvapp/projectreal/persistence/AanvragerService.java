package nl.ycvvapp.projectreal.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycvvapp.projectreal.domein.Aanvrager;

@Service
public class AanvragerService {

	@Autowired
	AanvragerRepository aar;
	
	public void maakNieuweAanbieder() {
		Aanvrager aa = new Aanvrager();
		aa.titel = "mijn titel";
		aar.save(aa);
		System.out.println("Ik ben in nieuwe Aanbiederservice");
	}
}
