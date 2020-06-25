package it.dstech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.model.Message;
import it.dstech.repository.MessageRepository;

@Service
public class MessageServiceDAOImpl implements MessageServiceDAO {
	
	@Autowired
	private MessageRepository messageRepos;
	
	@Override
	public Message sendMessage() {
		
		Message message = new Message();
		return message;
	}
	
	@Override
	public List<Message> findAll() {
		return messageRepos.findAll();
	}
}
