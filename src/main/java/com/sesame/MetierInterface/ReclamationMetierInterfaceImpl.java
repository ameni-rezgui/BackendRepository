package com.sesame.MetierInterface;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sesame.DAO.Message;
import com.sesame.DAO.Reclamation;
import com.sesame.MetierService.ReclamationMetierInterface;
import com.sesame.Repository.Message_repository;
import com.sesame.Repository.Reclamation_repository;

public class ReclamationMetierInterfaceImpl implements ReclamationMetierInterface {

	@Autowired
	private Reclamation_repository vr;
	@Transactional
	@Override
	public List<Reclamation> getAll() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}
	@Transactional
	@Override
	public Reclamation getId(long id) {
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
	public Reclamation add(Reclamation Reclamation) {
		// TODO Auto-generated method stub
		return vr.save(Reclamation);
	}
}
