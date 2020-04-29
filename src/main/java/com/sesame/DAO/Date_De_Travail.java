package com.sesame.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Date_De_Travail implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	private String jour;
	private String heur_debut;
	private String heur_fin;
	@ManyToMany
	@JoinTable(
			name="Client_Date_De_Travail",
					
			joinColumns=@JoinColumn(name="Date_De_Travails_id"),
			inverseJoinColumns =@JoinColumn(name="Clietn_id")
		
			)
	private List<Client> clients;
	
	 @ManyToMany
		@JoinTable(
				name="Centre_Visite_Date_De_Travail",

				joinColumns=@JoinColumn(name="Date_De_Travails_id"),
				inverseJoinColumns =@JoinColumn(name="Centre_Visite_id")
			
				)
	private List<Centre_Visite> Centre_Visite;

}
