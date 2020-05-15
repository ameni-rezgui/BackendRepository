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
public class Type_vehicule implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID_Type;
	private String Nom_Type;
	private String Carroserie;
	private String Genre;
	@JsonIgnore
	@OneToMany
	private List<vehicule> vehicules;
	@JsonIgnore
	@OneToMany(mappedBy = "type_vehicule")
	private List<couloir> couloirs;
	public long getID_Type() {
		return ID_Type;
	}
	public void setID_Type(long iD_Type) {
		ID_Type = iD_Type;
	}
	public String getNom_Type() {
		return Nom_Type;
	}
	public void setNom_Type(String nom_Type) {
		Nom_Type = nom_Type;
	}
	public String getCarroserie() {
		return Carroserie;
	}
	public void setCarroserie(String carroserie) {
		Carroserie = carroserie;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public List<vehicule> getVehicules() {
		return vehicules;
	}
	public void setVehicules(List<vehicule> vehicules) {
		this.vehicules = vehicules;
	}
	public List<couloir> getCouloirs() {
		return couloirs;
	}
	public void setCouloirs(List<couloir> couloirs) {
		this.couloirs = couloirs;
	}
	public Type_vehicule(long iD_Type, String nom_Type, String carroserie, String genre, List<vehicule> vehicules,
			List<couloir> couloirs) {
		super();
		ID_Type = iD_Type;
		Nom_Type = nom_Type;
		Carroserie = carroserie;
		Genre = genre;
		this.vehicules = vehicules;
		this.couloirs = couloirs;
	}
	public Type_vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Type_vehicule [ID_Type=" + ID_Type + ", Nom_Type=" + Nom_Type + ", Carroserie=" + Carroserie
				+ ", Genre=" + Genre + ", vehicules=" + vehicules + ", couloirs=" + couloirs + "]";
	}
	

}
