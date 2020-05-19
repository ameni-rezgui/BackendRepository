package com.sesame.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.DAO.Reclamation;
import com.sesame.DAO.Rendez_vous;
import com.sesame.MetierService.Rendez_VousMetierInterface;
import com.sesame.Repository.Reclamation_repository;
import com.sesame.Repository.Rendezvous;
import com.sesame.Rest.rendez_vous;

@Service
public class rendez_vousMetierInterfaceImpl implements Rendez_VousMetierInterface {
	@Autowired
	private Rendezvous vr;
	@Transactional
	@Override
	public List<Rendez_vous> getAll() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}
	@Transactional
	@Override
	public Rendez_vous getId(long id) {
		// TODO Auto-generated method stub
		return vr.findById(id).get();
	}
	@Transactional
	@Override
	public void delete(long id) {
               vr.deleteById(id);		
	}
	@Transactional
	@Override
	public Rendez_vous add(Rendez_vous Rendez_vous) {
		// TODO Auto-generated method stub
		return vr.save(Rendez_vous);
	}
	
	  @Override public Collection<Rendez_vous> Recherchecentre(long a) { // TODO
	 // Auto-generated method stub 
		  return vr.Recherche(a); }
	  
	  @Override public int Recherchedejaexit(long a, String s) { // TODO
	  //Auto-generated method stub
	  return vr.recherchecentrestart(a,s); }
	 



}
