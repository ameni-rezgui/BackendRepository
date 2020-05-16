package com.sesame.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.DAO.ReclamationGenerique;
import com.sesame.MetierService.ReclamationG_MetierInterface;
import com.sesame.Repository.ReclamationG_repository;


@Service
public class ReclamationGMetiernterfaceImpl  implements ReclamationG_MetierInterface {
	

	@Autowired
	private ReclamationG_repository vr;

	@Transactional
	@Override
	public ReclamationGenerique getId(long id) {
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
	public ReclamationGenerique add(ReclamationGenerique Reclamation) {
		// TODO Auto-generated method stub
		return vr.save(Reclamation);
	}
	
	
	@Transactional
	@Override
	public List<ReclamationGenerique> getAll() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}

}
