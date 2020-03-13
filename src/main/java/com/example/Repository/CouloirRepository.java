package com.example.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.DAO.Couloir;

public interface CouloirRepository extends JpaRepository<Couloir, Long >{
	


}
