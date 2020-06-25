package it.dstech.service;

import java.util.List;

import it.dstech.model.Message;

public interface MessageServiceDAO {

	public Message sendMessage();

	List<Message> findAll();

}
