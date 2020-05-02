package com.sesame.MetierInterface;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sesame.DAO.Chef_couloir;
import com.sesame.DAO.couloir;
import com.sesame.MetierService.Chef_CouloirMetierInterface;
import com.sesame.Repository.Chef_couloir_repository;
import com.sesame.Repository.couloir_repository;

public class Chef_couloirMetierInterfaceImpl implements Chef_CouloirMetierInterface {


	@Autowired
	private Chef_couloir_repository vr;
	@Transactional
	@Override
	public List<Chef_couloir> getAll() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}
	@Transactional
	@Override
	public Chef_couloir getId(long id) {
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
	public Chef_couloir add(Chef_couloir Vehicule) {
		// TODO Auto-generated method stub
		return vr.save(Vehicule);
	}
}
