package com.sesame.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.DAO.Compte;
import com.sesame.MetierService.CompteMetierInterface;
import com.sesame.Repository.Compte_repository;
@Service
public class CompteMetierInterfaceImpl implements CompteMetierInterface {
 @Autowired
 private Compte_repository cr;
 @Transactional
	@Override
	public List<Compte> getAll() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}
 @Transactional
	@Override
	public Compte getId(long id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}
 @Transactional
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);

	}
 @Transactional
	@Override
	public Compte add(Compte Compte) {
		// TODO Auto-generated method stub
		return cr.save(Compte);
	}

}
