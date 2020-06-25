package it.dstech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dstech.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long>{

	
    public List<Message> findByUtenteOrderByTimestampAsc(String userSend);
	
	public List<Message> findByUtenteOrderByTimestampDesc(String userRecive);
	
	
}
