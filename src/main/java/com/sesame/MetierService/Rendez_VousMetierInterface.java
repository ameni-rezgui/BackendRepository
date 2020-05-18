package com.sesame.MetierService;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sesame.DAO.Rendez_vous;
import com.sesame.DAO.Type_vehicule;
import com.sesame.DAO.vehicule;
import com.sesame.Rest.rendez_vous;

public interface Rendez_VousMetierInterface {
	public Rendez_vous getId(long id);
	public void delete(long id);
	public  Rendez_vous add(Rendez_vous Rendez_vous);
	public List<Rendez_vous> getAll();
	public Collection<Rendez_vous> Recherchecentre(long a);
}
