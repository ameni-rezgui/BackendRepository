package com.sesame.MetierService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sesame.DAO.Type_vehicule;
import com.sesame.DAO.couloir;
import com.sesame.DAO.vehicule;
@Service
public interface coulirMetierInterface {
	public couloir getId(long id);
	public void delete(long id);
	public  couloir add(couloir couloir);
	public List<couloir> getAll();

}
