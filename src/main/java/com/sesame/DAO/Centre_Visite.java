package com.sesame.DAO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

public class Centre_Visite implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID_Centre;
	private String Nom_Centre;
	private String Region_Centre;
	private String ville_Centre; 
	private String Rue; 
	private int codePostal; 
	private String Longitude;
	private String latitude ;
	private int Nomber_Couloir;
	private String typeService; 
	private long telephone; 
	private String Horaire; 
	@JsonIgnore
	@OneToMany(
			mappedBy = "centre_Visite",
			fetch = FetchType.LAZY
			)
	private List<Reclamation> reclamation;
	@OneToMany(
			mappedBy = "centre_Visite",
			fetch = FetchType.LAZY
			)
	private List<ReclamationGenerique> reclamationg;
	@JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    private couloir couloir;

    
    

	public long getID_Centre() {
		return ID_Centre;
	}



	public void setID_Centre(long iD_Centre) {
		ID_Centre = iD_Centre;
	}



	public String getNom_Centre() {
		return Nom_Centre;
	}



	public void setNom_Centre(String nom_Centre) {
		Nom_Centre = nom_Centre;
	}



	public String getRegion_Centre() {
		return Region_Centre;
	}



	public void setRegion_Centre(String region_Centre) {
		Region_Centre = region_Centre;
	}



	public String getVille_Centre() {
		return ville_Centre;
	}



	public void setVille_Centre(String ville_Centre) {
		this.ville_Centre = ville_Centre;
	}



	public String getRue() {
		return Rue;
	}



	public void setRue(String rue) {
		Rue = rue;
	}



	public int getCodePostal() {
		return codePostal;
	}



	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}



	


	public int getNomber_Couloir() {
		return Nomber_Couloir;
	}



	public void setNomber_Couloir(int nomber_Couloir) {
		Nomber_Couloir = nomber_Couloir;
	}



	public String getTypeService() {
		return typeService;
	}



	public void setTypeService(String typeService) {
		this.typeService = typeService;
	}



	public long getTelephone() {
		return telephone;
	}



	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}



	public String getHoraire() {
		return Horaire;
	}



	public void setHoraire(String horaire) {
		Horaire = horaire;
	}



	public List<Reclamation> getReclamation() {
		return reclamation;
	}



	public void setReclamation(List<Reclamation> reclamation) {
		this.reclamation = reclamation;
	}



	public couloir getCouloir() {
		return couloir;
	}



	public void setCouloir(couloir couloir) {
		this.couloir = couloir;
	}




	

	public String getLongitude() {
		return Longitude;
	}



	public void setLongitude(String longitude) {
		Longitude = longitude;
	}



	public String getLatitude() {
		return latitude;
	}



	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}



	public Centre_Visite(long iD_Centre, String nom_Centre, String region_Centre, String ville_Centre, String rue,
			int codePostal, String longitude, String latitude, int nomber_Couloir, String typeService, long telephone,
			String horaire) {
		super();
		ID_Centre = iD_Centre;
		Nom_Centre = nom_Centre;
		Region_Centre = region_Centre;
		this.ville_Centre = ville_Centre;
		Rue = rue;
		this.codePostal = codePostal;
		Longitude = longitude;
		this.latitude = latitude;
		Nomber_Couloir = nomber_Couloir;
		this.typeService = typeService;
		this.telephone = telephone;
		Horaire = horaire;
		
	}



	public Centre_Visite() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	
	
    
}
