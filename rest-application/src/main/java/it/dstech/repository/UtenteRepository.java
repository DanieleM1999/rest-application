package it.dstech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dstech.model.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Long>{

}
