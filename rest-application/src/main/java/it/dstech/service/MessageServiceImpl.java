package it.dstech.service;

import org.springframework.stereotype.Service;

import it.dstech.model.Message;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Override
	public Message sendMessage() {
		
		Message message = new Message();

		return message;
	}
}
