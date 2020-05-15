package com.sesame.MetierService;

import java.util.List;



import com.sesame.DAO.vehicule;

public interface VehiculeMetierInterface {
	public List<vehicule> getAll();
	public vehicule getId(long id);
	public void delete(long id);
	public  vehicule add(vehicule Vehicule);

}
