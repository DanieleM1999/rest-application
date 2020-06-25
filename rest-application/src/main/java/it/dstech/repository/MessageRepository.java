package it.dstech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dstech.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long>{

}
