package com.sesame.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesame.DAO.Chef_couloir;
import com.sesame.DAO.couloir;

public interface Chef_couloir_repository extends JpaRepository<Chef_couloir, Long> {

	public  Chef_couloir findByCouloir(couloir c);
	
	
	

}
