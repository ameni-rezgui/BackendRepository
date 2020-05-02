package com.sesame.MetierInterface;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sesame.DAO.Date_De_Travail;
import com.sesame.DAO.couloir;
import com.sesame.MetierService.Date_de_TravailMetierInterface;
import com.sesame.Repository.Date_de_travail_repository;
import com.sesame.Repository.couloir_repository;

public class Date_travMetierInterfaceImpl implements Date_de_TravailMetierInterface {

	@Autowired
	private Date_de_travail_repository vr;
	@Transactional
	@Override
	public List<Date_De_Travail> getAll() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}
	@Transactional
	@Override
	public Date_De_Travail getId(long id) {
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
	public Date_De_Travail add(Date_De_Travail couloir) {
		// TODO Auto-generated method stub
		return vr.save(couloir);
	}
}
