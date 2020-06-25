package it.dstech.service;

import java.util.List;

import it.dstech.model.Message;
import it.dstech.model.Utente;

public interface MessageServiceDAO {

	boolean add(Message m);
	
	List<Message> findAll();
	
	void delete(Message m);

	List<Message> showRecivedMessage(Utente userSend);

	List<Message> showSentMessage(Utente userSend);
}
