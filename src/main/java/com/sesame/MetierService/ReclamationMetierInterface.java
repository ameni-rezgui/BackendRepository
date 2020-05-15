package com.sesame.MetierService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sesame.DAO.Reclamation;
import com.sesame.DAO.Type_vehicule;
import com.sesame.DAO.vehicule;

public interface ReclamationMetierInterface {
	public Reclamation getId(long id);
	public void delete(long id);
	public  Reclamation add(Reclamation Reclamation);
	public List<Reclamation> getAll();
}
