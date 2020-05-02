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

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public String getHeur_debut() {
		return heur_debut;
	}

	public void setHeur_debut(String heur_debut) {
		this.heur_debut = heur_debut;
	}

	public String getHeur_fin() {
		return heur_fin;
	}

	public void setHeur_fin(String heur_fin) {
		this.heur_fin = heur_fin;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public List<Centre_Visite> getCentre_Visite() {
		return Centre_Visite;
	}

	public void setCentre_Visite(List<Centre_Visite> centre_Visite) {
		Centre_Visite = centre_Visite;
	}

}
