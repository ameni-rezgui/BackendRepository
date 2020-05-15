package com.sesame.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.DAO.Centre_Visite;
import com.sesame.DAO.vehicule;
import com.sesame.MetierService.Centre_visiteMetierInterface;
import com.sesame.Repository.Centre_Visite_Repository;
@Service
public class Centre_visiteMetierInterfaceImpl implements Centre_visiteMetierInterface {

	@Autowired
	private Centre_Visite_Repository vr;
	@Transactional
	@Override
	public List<Centre_Visite> getAll() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}
	@Transactional
	@Override
	public Centre_Visite getId(long id) {
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
	public Centre_Visite add(Centre_Visite Vehicule) {
		// TODO Auto-generated method stub
		return vr.save(Vehicule);
	}

}
