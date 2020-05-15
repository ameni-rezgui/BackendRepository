package com.sesame.DAO;

import java.io.Serializable;
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
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID_CL; 
	private String cin_CL;
	private String Nom_CL;
	private String Date_Naissance_CL;
	private int Age_CL;
	private String  Numero_Tle_CL;
	private String Email_CL;
	private String Region_CL;
	private String Ville_CL;
	private String Code_postale_CL;
	private String Numero_Permis_conduite_CL;
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Compte_ID")
	private Compte compte;
	@JsonIgnore
	@OneToMany(
			mappedBy = "client",
			fetch = FetchType.LAZY)
	private List<vehicule> vehicules ;
	
	@OneToMany(
			mappedBy = "client",
			fetch = FetchType.LAZY
			)
	private List<ReclamationGenerique> reclamationg;

	public long getID_CL() {
		return ID_CL;
	}
	public void setID_CL(long iD_CL) {
		ID_CL = iD_CL;
	}
	public String getCin_CL() {
		return cin_CL;
	}
	public void setCin_CL(String cin_CL) {
		this.cin_CL = cin_CL;
	}
	public String getNom_CL() {
		return Nom_CL;
	}
	public void setNom_CL(String nom_CL) {
		Nom_CL = nom_CL;
	}
	public String getDate_Naissance_CL() {
		return Date_Naissance_CL;
	}
	public void setDate_Naissance_CL(String date_Naissance_CL) {
		Date_Naissance_CL = date_Naissance_CL;
	}
	public int getAge_CL() {
		return Age_CL;
	}
	public void setAge_CL(int age_CL) {
		Age_CL = age_CL;
	}
	public String getNumero_Tle_CL() {
		return Numero_Tle_CL;
	}
	public void setNumero_Tle_CL(String numero_Tle_CL) {
		Numero_Tle_CL = numero_Tle_CL;
	}
	public String getEmail_CL() {
		return Email_CL;
	}
	public void setEmail_CL(String email_CL) {
		Email_CL = email_CL;
	}
	public String getRegion_CL() {
		return Region_CL;
	}
	public void setRegion_CL(String region_CL) {
		Region_CL = region_CL;
	}
	public String getVille_CL() {
		return Ville_CL;
	}
	public void setVille_CL(String ville_CL) {
		Ville_CL = ville_CL;
	}
	public String getCode_postale_CL() {
		return Code_postale_CL;
	}
	public void setCode_postale_CL(String code_postale_CL) {
		Code_postale_CL = code_postale_CL;
	}
	public String getNumero_Permis_conduite_CL() {
		return Numero_Permis_conduite_CL;
	}
	public void setNumero_Permis_conduite_CL(String numero_Permis_conduite_CL) {
		Numero_Permis_conduite_CL = numero_Permis_conduite_CL;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public List<vehicule> getVehicules() {
		return vehicules;
	}
	public void setVehicules(List<vehicule> vehicules) {
		this.vehicules = vehicules;
	}

	public Client(long iD_CL, String cin_CL, String nom_CL, String date_Naissance_CL, int age_CL, String numero_Tle_CL,
			String email_CL, String region_CL, String ville_CL, String code_postale_CL,
			String numero_Permis_conduite_CL, Compte compte, List<vehicule> vehicules
			) {
		super();
		ID_CL = iD_CL;
		this.cin_CL = cin_CL;
		Nom_CL = nom_CL;
		Date_Naissance_CL = date_Naissance_CL;
		Age_CL = age_CL;
		Numero_Tle_CL = numero_Tle_CL;
		Email_CL = email_CL;
		Region_CL = region_CL;
		Ville_CL = ville_CL;
		Code_postale_CL = code_postale_CL;
		Numero_Permis_conduite_CL = numero_Permis_conduite_CL;
		this.compte = compte;
		this.vehicules = vehicules;

	}
	public Client() {
		
	}
	

	
	
	

}
