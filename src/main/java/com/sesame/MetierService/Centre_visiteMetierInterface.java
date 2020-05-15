package com.sesame.MetierService;

import java.util.List;



import com.sesame.DAO.Centre_Visite;

public interface Centre_visiteMetierInterface {
	public Centre_Visite getId(long id);
	public void delete(long id);
	public  Centre_Visite add(Centre_Visite Centre_Visite);
	public List<Centre_Visite> getAll();

}
