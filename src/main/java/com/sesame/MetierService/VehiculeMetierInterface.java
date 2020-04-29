package com.sesame.MetierService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sesame.DAO.vehicule;
@Service

public interface VehiculeMetierInterface {
	public List<vehicule> getAll();
	public vehicule getId(long id);
	public void delete(long id);
	public  vehicule add(vehicule Vehicule);

}
