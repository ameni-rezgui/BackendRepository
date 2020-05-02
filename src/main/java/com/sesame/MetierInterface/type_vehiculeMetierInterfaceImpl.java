package com.sesame.MetierInterface;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sesame.DAO.Rendez_vous;
import com.sesame.DAO.Type_vehicule;
import com.sesame.DAO.vehicule;
import com.sesame.MetierService.Type_vehiculeMetierInterface;
import com.sesame.Repository.Rendezvous;
import com.sesame.Repository.Type_vehicule_repository;

public class type_vehiculeMetierInterfaceImpl implements Type_vehiculeMetierInterface {

	@Autowired
	private Type_vehicule_repository vr;
	@Transactional
	@Override
	public List<Type_vehicule> getAll() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}
	@Transactional
	@Override
	public Type_vehicule getId(long id) {
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
	public Type_vehicule add(Type_vehicule Type_vehicule) {
		// TODO Auto-generated method stub
		return vr.save(Type_vehicule);	}
}
