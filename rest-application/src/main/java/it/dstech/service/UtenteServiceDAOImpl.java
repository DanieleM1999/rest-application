package it.dstech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.model.Utente;
import it.dstech.repository.UtenteRepository;

@Service
public class UtenteServiceDAOImpl implements UtenteServiceDAO {

	@Autowired
	private UtenteRepository utenteRepos;

	@Override
	public boolean add(Utente t) {
		Utente save = utenteRepos.save(t);
		return save != null;
	}

	@Override
	public List<Utente> findAll() {
		return utenteRepos.findAll();
	}

	@Override
	public void remove(Utente t) {
		utenteRepos.delete(t);
	}

}
