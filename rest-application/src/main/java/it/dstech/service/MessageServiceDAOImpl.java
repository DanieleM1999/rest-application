package it.dstech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.model.Message;
import it.dstech.model.Utente;
import it.dstech.repository.MessageRepository;

@Service
public class MessageServiceDAOImpl implements MessageServiceDAO {
	
	@Autowired
	private MessageRepository messageRepos;

	@Override
	public boolean add(Message m) {
		Message  newMessage = messageRepos.save(m);
		return newMessage != null;
	}


	@Override
	public List<Message> findAll() {
		return messageRepos.findAll();
	}


	@Override
	public void delete(Message m) {
		messageRepos.delete(m);
		
	}
	
	@Override
	public List<Message> showRecivedMessage(Utente userSend){
		return (List<Message>) messageRepos.findByUtenteOrderByTimestampAsc("userSend");
	}
	
	@Override
	public List<Message> showSentMessage(Utente userRecive){
		return (List<Message>) messageRepos.findByUtenteOrderByTimestampDesc("userRecives");
	}
}
