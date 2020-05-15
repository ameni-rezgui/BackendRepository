package com.sesame.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Marque implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID_Marque;
	private String Nom_marque;
	private String Gamme;
	private String TypeComerciale_M;
	private String PaysOrigine;
	@JsonIgnore
	@OneToMany(mappedBy = "marque")
	private  List<vehicule>  vehicules;
	public long getID_Marque() {
		return ID_Marque;
	}
	public void setID_Marque(long iD_Marque) {
		ID_Marque = iD_Marque;
	}
	public String getNom_marque() {
		return Nom_marque;
	}
	public void setNom_marque(String nom_marque) {
		Nom_marque = nom_marque;
	}
	public String getGamme() {
		return Gamme;
	}
	public void setGamme(String gamme) {
		Gamme = gamme;
	}
	public String getTypeComerciale_M() {
		return TypeComerciale_M;
	}
	public void setTypeComerciale_M(String typeComerciale_M) {
		TypeComerciale_M = typeComerciale_M;
	}
	public String getPaysOrigine() {
		return PaysOrigine;
	}
	public void setPaysOrigine(String paysOrigine) {
		PaysOrigine = paysOrigine;
	}
	public List<vehicule> getVehicules() {
		return vehicules;
	}
	public void setVehicules(List<vehicule> vehicules) {
		this.vehicules = vehicules;
	}
	

		

}
