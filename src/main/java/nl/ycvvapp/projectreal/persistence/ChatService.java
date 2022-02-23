package nl.ycvvapp.projectreal.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.ycvvapp.projectreal.domein.Chat;

@Service
public class ChatService {
	@Autowired
	ChatRepository cr;
	
	public void maakNieuweChat() {
		Chat nc = new Chat();
		
		nc.setNaam("Malin");
		
		cr.save(nc);
		System.out.println("Nieuwe chat");
	}
	
	public Chat giveChat() {
		Chat c = new Chat();
		c.setContent("Blabla");
		c.setTime(1700);
		return giveChat();
	}
}
