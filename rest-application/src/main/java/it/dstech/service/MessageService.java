package it.dstech.service;

import java.util.List;

import it.dstech.model.Message;

public interface MessageService {

	public Message sendMessage();

	List<Message> findAll();

}
