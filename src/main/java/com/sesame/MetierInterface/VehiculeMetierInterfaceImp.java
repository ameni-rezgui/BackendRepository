package com.sesame.MetierInterface;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.DAO.vehicule;
import com.sesame.MetierService.VehiculeMetierInterface;
import com.sesame.Repository.vehicule_repository;
@Service
public class VehiculeMetierInterfaceImp implements VehiculeMetierInterface {
	@Autowired
	private vehicule_repository vr;
	@Transactional
	@Override
	public List<vehicule> getAll() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}
	@Transactional
	@Override
	public vehicule getId(long id) {
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
	public vehicule add(vehicule Vehicule) {
		// TODO Auto-generated method stub
		return vr.save(Vehicule);
	}

}
