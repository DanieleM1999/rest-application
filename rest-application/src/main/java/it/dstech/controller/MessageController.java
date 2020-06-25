package it.dstech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.dstech.model.Message;
import it.dstech.service.MessageServiceDAO;

@RestController
public class MessageController {

	@Autowired
	private MessageServiceDAO messageService;

	@RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
	public Message sendSMS() {
		return messageService.sendMessage();
	}

}
