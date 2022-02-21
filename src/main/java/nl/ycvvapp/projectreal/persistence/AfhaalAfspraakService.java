package nl.ycvvapp.projectreal.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycvvapp.projectreal.domein.AfhaalAfspraak;

@Service
public class AfhaalAfspraakService {
	@Autowired
	AfhaalAfspraakRepository aar;
	
	public void maakNieuweAfhaalAfspraak() {
		AfhaalAfspraak aa = new AfhaalAfspraak();
		aa.titel = "mijn titel";
		aar.save(aa);
		System.out.println("Ik ben in nieuwe AfhaalAfspraakService");
	}

}
