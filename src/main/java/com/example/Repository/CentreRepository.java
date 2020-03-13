package com.example.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DAO.CentreVisite;
import com.example.DAO.Client;

public interface CentreRepository extends JpaRepository<CentreVisite, Long > {
public List<CentreVisite> findByNom(String nom);
	
	// pageable  : objet ou on va définit le taille d'une page
	public Page<CentreVisite> findByNom(String nom, Pageable p );
	
	public List<CentreVisite> findByNomContaining(String a);
	
	public List<CentreVisite> findByNbCouloir(int nb); 
	
	
}
