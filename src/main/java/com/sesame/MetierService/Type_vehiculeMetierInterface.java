package com.sesame.MetierService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sesame.DAO.Type_vehicule;
import com.sesame.DAO.vehicule;

public interface Type_vehiculeMetierInterface {
	public Type_vehicule getId(long id);
	public void delete(long id);
	public  Type_vehicule add(Type_vehicule Type_vehicule);
	public List<Type_vehicule> getAll();

}
