package com.sesame.MetierService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sesame.DAO.Chef_couloir;
import com.sesame.DAO.Type_vehicule;
import com.sesame.DAO.vehicule;
@Service
public interface Chef_CouloirMetierInterface {
	public Chef_couloir getId(long id);
	public void delete(long id);
	public  Chef_couloir add(Chef_couloir Chef_couloir);
	public List<Chef_couloir> getAll();
}
