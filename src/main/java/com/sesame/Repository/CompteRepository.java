package com.sesame.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesame.DAO.Compte;




public interface CompteRepository  extends JpaRepository<Compte, Long > {

	// pageable  : objet ou on va définit le taille d'une page
	public Page<Compte> findByLogin(String login, Pageable p );
	public Optional<Compte> findByLogin(String login);
	
	public List<Compte> findByLoginContaining(String a);
	
	public List<Compte> findByMdp(String mdp); 
	

}
