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
		aa.setTitel("mijn titel");
		aar.save(aa);
		System.out.println("Ik ben in nieuwe AfhaalAfspraakService");
	}
	public Iterable<AfhaalAfspraak> go() {
		 Iterable<AfhaalAfspraak> abcdef = aar.findAll();
		 return abcdef;
	}
}
