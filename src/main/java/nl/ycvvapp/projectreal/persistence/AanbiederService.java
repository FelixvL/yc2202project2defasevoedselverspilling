package nl.ycvvapp.projectreal.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycvvapp.projectreal.domein.Aanbieder;

@Service
public class AanbiederService {
	@Autowired
	AanbiederRepository ar;
	
	public void CreateAanbieder( Aanbieder aanbieder) {
		ar.save(aanbieder);
	}
	public void DeleteAanbieder( long id) {
        ar.deleteById(id);
        }

    public Iterable<Aanbieder> GetAllAanbieders() {
         Iterable<Aanbieder> al = ar.findAll();
         return al;
    }
}
