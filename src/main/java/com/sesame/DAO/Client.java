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
	private String prenom_CL;
	private String Date_Naissance_CL;
	private int Age_CL;
	private String  Numero_Tle_CL;
	private String Email_CL;
	private String Region_CL;
	private String Ville_CL;
	private String Code_postale_CL;
	private String Numero_Permis_conduite_CL;
	private String Login;
	private String password;
	private String roles;
	private boolean Active;

	
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

	public List<vehicule> getVehicules() {
		return vehicules;
	}
	public void setVehicules(List<vehicule> vehicules) {
		this.vehicules = vehicules;
	}
	
	

	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public boolean isActive() {
		return Active;
	}
	public void setActive(boolean active) {
		Active = active;
	}
	public String getPrenom_CL() {
		return prenom_CL;
	}
	public void setPrenom_CL(String prenom_CL) {
		this.prenom_CL = prenom_CL;
	}
	public List<ReclamationGenerique> getReclamationg() {
		return reclamationg;
	}
	public void setReclamationg(List<ReclamationGenerique> reclamationg) {
		this.reclamationg = reclamationg;
	}

	public Client() {
		
	}
	public Client(long iD_CL, String cin_CL, String nom_CL, String prenom_CL, String date_Naissance_CL, int age_CL,
			String numero_Tle_CL, String email_CL, String region_CL, String ville_CL, String code_postale_CL,
			String numero_Permis_conduite_CL, String login, String password, String roles, boolean active,
			List<vehicule> vehicules, List<ReclamationGenerique> reclamationg) {
		super();
		ID_CL = iD_CL;
		this.cin_CL = cin_CL;
		Nom_CL = nom_CL;
		this.prenom_CL = prenom_CL;
		Date_Naissance_CL = date_Naissance_CL;
		Age_CL = age_CL;
		Numero_Tle_CL = numero_Tle_CL;
		Email_CL = email_CL;
		Region_CL = region_CL;
		Ville_CL = ville_CL;
		Code_postale_CL = code_postale_CL;
		Numero_Permis_conduite_CL = numero_Permis_conduite_CL;
		Login = login;
		this.password = password;
		this.roles = roles;
		Active = active;
		this.vehicules = vehicules;
		this.reclamationg = reclamationg;
	}
	
	
	

	
	
	

}
