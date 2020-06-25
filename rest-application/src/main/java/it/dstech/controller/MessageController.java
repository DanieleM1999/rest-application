package it.dstech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.dstech.model.Message;
import it.dstech.service.MessageServiceDAO;

@RestController
public class MessageController {

	@Autowired
	private MessageServiceDAO messageService;

	@RequestMapping("/message")
	public List<Message> getAllMessage() {
		return messageService.findAll();
	}
	
	@RequestMapping(value = ("/message"), method = RequestMethod.POST)
	public boolean addNewMessage(@RequestBody Message message) {
		return messageService.add(message);
	}
	
	@RequestMapping(value = ("/message"), method = RequestMethod.POST)
	public void deleteMessage(@RequestBody Message message) {
		messageService.delete(message);
	}
	
	@RequestMapping(value = ("/message"), method = RequestMethod.POST)
	public List<Message> showRecivedMessage(@RequestBody String username) {
		return null;//da fare
	}
	
	@RequestMapping(value = ("/message"), method = RequestMethod.POST)
	public List<Message> showSentMessage(@RequestBody String username) {
		return null;//da fare
	}
		
}
