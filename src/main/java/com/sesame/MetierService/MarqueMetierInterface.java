package com.sesame.MetierService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sesame.DAO.Marque;
@Service

public interface MarqueMetierInterface {
	public List<Marque> getAll();
	public Marque getId(long id);
	public void delete(long id);
	public  Marque add(Marque Marque);

}
