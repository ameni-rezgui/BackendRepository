package com.sesame.MetierService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sesame.DAO.Centre_Visite;
import com.sesame.DAO.Type_vehicule;
import com.sesame.DAO.vehicule;
@Service
public interface Centre_visiteMetierInterface {
	public Centre_Visite getId(long id);
	public void delete(long id);
	public  Centre_Visite add(Centre_Visite Centre_Visite);
	public List<Centre_Visite> getAll();

}
