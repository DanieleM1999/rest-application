package it.dstech.service;

import java.util.List;

import it.dstech.model.Message;

public interface MessageServiceDAO {

	boolean add(Message m);
	
	List<Message> findAll();
	
	List<Message> findByUtenteOrderByDataDesc(Message m);
	
	void delete(Message m);

}
