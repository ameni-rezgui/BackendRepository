package com.sesame.MetierInterface;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sesame.DAO.Chef_couloir;
import com.sesame.DAO.couloir;
import com.sesame.MetierService.coulirMetierInterface;
import com.sesame.Repository.Chef_couloir_repository;
import com.sesame.Repository.couloir_repository;

public class couloirMetierInterfaceImpl implements coulirMetierInterface {

	@Autowired
	private couloir_repository vr;
	@Transactional
	@Override
	public List<couloir> getAll() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}
	@Transactional
	@Override
	public couloir getId(long id) {
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
	public couloir add(couloir couloir) {
		// TODO Auto-generated method stub
		return vr.save(couloir);
	}

}
