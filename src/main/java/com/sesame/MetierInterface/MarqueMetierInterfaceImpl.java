package com.sesame.MetierInterface;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.DAO.Marque;
import com.sesame.DAO.vehicule;
import com.sesame.MetierService.MarqueMetierInterface;
import com.sesame.Repository.Marque_repository;
@Service
public class MarqueMetierInterfaceImpl implements MarqueMetierInterface {
	@Autowired
	private Marque_repository mr;
	@Transactional
	@Override
	public List<Marque> getAll() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}
	@Transactional
	@Override
	public Marque getId(long id) {
		// TODO Auto-generated method stub
		return mr.findById(id).get();
	}
	@Transactional
	@Override
	public void delete(long id) {
		mr.deleteById(id);		
	}
	@Transactional
	@Override
	public Marque add(Marque Marque) {
		// TODO Auto-generated method stub
		return mr.save(Marque);
	}
}
