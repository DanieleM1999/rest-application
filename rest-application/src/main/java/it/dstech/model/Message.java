package it.dstech.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String userSend;

	private String userRecive;
	
	private String testo;
	
	private LocalDateTime timestamp;
	
	 @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	    public LocalDateTime getTimestamp() {
	        return timestamp;
	    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserSend() {
		return userSend;
	}

	public void setUserSend(String userSend) {
		this.userSend = userSend;
	}

	public String getUserRecive() {
		return userRecive;
	}

	public void setUserRecive(String userRecive) {
		this.userRecive = userRecive;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
	 
	 
}
	
	
	
	
	
