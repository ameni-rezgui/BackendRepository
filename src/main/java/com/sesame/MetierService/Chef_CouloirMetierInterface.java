package com.sesame.MetierService;

import java.util.List;



import com.sesame.DAO.Chef_couloir;


public interface Chef_CouloirMetierInterface {
	public Chef_couloir getId(long id);
	public void delete(long id);
	public  Chef_couloir add(Chef_couloir Chef_couloir);
	public List<Chef_couloir> getAll();
}
