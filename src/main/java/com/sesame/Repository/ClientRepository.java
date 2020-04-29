package com.sesame.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sesame.DAO.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
	@Query("select s from Client s where s.Nom_CL = ?1")
	public Optional<Client> getname(String nom);

}
