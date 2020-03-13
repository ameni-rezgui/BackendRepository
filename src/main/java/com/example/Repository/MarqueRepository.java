package com.example.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DAO.Client;
import com.example.DAO.Marque;

public interface MarqueRepository extends JpaRepository<Marque, Long >{
public List<Marque> findByNom(String nom);
	
	// pageable  : objet ou on va définit le taille d'une page
	public Page<Marque> findByNom(String nom, Pageable p );
	
	public List<Marque> findByNomContaining(String a);
	
	public List<Marque> findByModele(String modele); 
	
	public List<Marque> findByGamme(String gamme); 
	

}
