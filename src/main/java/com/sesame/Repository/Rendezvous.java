package com.sesame.Repository;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sesame.DAO.Rendez_vous;

public interface Rendezvous extends JpaRepository<Rendez_vous, Long>
{
	  @Query(
	  value="SELECT * FROM  Rendez_vous r , Centre_Visite c  WHERE c.id_centre = r.centre AND r.centre =?1"
	  , nativeQuery=true) public Collection<Rendez_vous> Recherche(long a );
	  
	  @Query(
	  value="SELECT COUNT(*) FROM  Rendez_vous r , Centre_Visite c  WHERE c.id_centre = r.centre AND r.centre =?1 AND r.start=?2"
	  , nativeQuery=true) public int recherchecentrestart(long a ,String s);
	 
}
