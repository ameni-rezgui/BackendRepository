package com.sesame.MetierService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sesame.DAO.Compte;
@Service

public interface CompteMetierInterface {
	public List<Compte> getAll();
	public Compte getId(long id);
	public void delete(long id);
	public  Compte add(Compte Compte);

}
