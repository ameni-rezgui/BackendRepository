package com.sesame.MetierService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sesame.DAO.Date_De_Travail;
import com.sesame.DAO.Type_vehicule;
import com.sesame.DAO.vehicule;
@Service
public interface Date_de_TravailMetierInterface {
	public Date_De_Travail getId(long id);
	public void delete(long id);
	public  Date_De_Travail add(Date_De_Travail Date_De_Travail);
	public List<Date_De_Travail> getAll();

}
