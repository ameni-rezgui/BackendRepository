package com.example.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.DAO.RendezVous;

public interface RendezVousRepository extends JpaRepository<RendezVous, Long > {
	
public List<RendezVous> findByDateR(Date date);
	
	// pageable  : objet ou on va définit le taille d'une page
	public Page<RendezVous> findByDateR(Date date, Pageable p );
	
	
	public List<RendezVous> findByHeure(String heure); 


}
