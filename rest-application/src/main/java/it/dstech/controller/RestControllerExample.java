package it.dstech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.dstech.model.Utente;
import it.dstech.service.UtenteServiceDAO;

@RestController
public class RestControllerExample {

	@Autowired
	private UtenteServiceDAO utenteService;

	@RequestMapping("/")
	public List<Utente> getAllPeople() {
		return utenteService.findAll();
	}
	
	@RequestMapping(value = ("/"), method = RequestMethod.POST)
	public boolean addNewUtente(@RequestBody Utente utente) {
		return utenteService.add(utente);
	}
	
	@RequestMapping(value = ("/"), method = RequestMethod.DELETE)
	public boolean removePersona(@RequestBody Utente utente) {
		utenteService.remove(utente);
		return true;
	}
	
	
	
}
