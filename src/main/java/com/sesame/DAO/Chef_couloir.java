package com.sesame.DAO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Chef_couloir implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID_CL;

	private String Nom_Ch;
	private String Prenom_Ch;
	private String Diplome;
	@Column(name="Numéro_tel")
	private String  Numero_Tle_Ch;
	private String Email_Ch;
	private String region_Ch;
	private int CIN;
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "Compte_id")
	private Compte compte;
	@JsonIgnore
	@OneToOne(mappedBy = "chef_couloir")
	private couloir couloir;
	
	public long getID_CL() {
		return ID_CL;
	}
	public void setID_CL(long iD_CL) {
		ID_CL = iD_CL;
	}
	public String getNom_Ch() {
		return Nom_Ch;
	}
	public void setNom_Ch(String nom_Ch) {
		Nom_Ch = nom_Ch;
	}
	public String getPrenom_Ch() {
		return Prenom_Ch;
	}
	public void setPrenom_Ch(String prenom_Ch) {
		Prenom_Ch = prenom_Ch;
	}
	public String getDiplome() {
		return Diplome;
	}
	public void setDiplome(String diplome) {
		Diplome = diplome;
	}
	public String getNumero_Tle_Ch() {
		return Numero_Tle_Ch;
	}
	public void setNumero_Tle_Ch(String numero_Tle_Ch) {
		Numero_Tle_Ch = numero_Tle_Ch;
	}
	public String getEmail_Ch() {
		return Email_Ch;
	}
	public void setEmail_Ch(String email_Ch) {
		Email_Ch = email_Ch;
	}
	
	public String getRegion_Ch() {
		return region_Ch;
	}
	public void setRegion_Ch(String region_Ch) {
		this.region_Ch = region_Ch;
	}
	public int getCIN() {
		return CIN;
	}
	public void setCIN(int cIN) {
		CIN = cIN;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public couloir getCouloir() {
		return couloir;
	}
	public void setCouloir(couloir couloir) {
		this.couloir = couloir;
	}
	public Chef_couloir(long iD_CL, String nom_Ch, String prenom_Ch, String diplome, String numero_Tle_Ch,
			String email_Ch, String region_Ch, int cIN, Compte compte, com.sesame.DAO.couloir couloir) {
		super();
		ID_CL = iD_CL;
		Nom_Ch = nom_Ch;
		Prenom_Ch = prenom_Ch;
		Diplome = diplome;
		Numero_Tle_Ch = numero_Tle_Ch;
		Email_Ch = email_Ch;
		this.region_Ch = region_Ch;
		CIN = cIN;
		this.compte = compte;
		this.couloir = couloir;
	}
	public Chef_couloir() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Chef_couloir [ID_CL=" + ID_CL + ", Nom_Ch=" + Nom_Ch + ", Prenom_Ch=" + Prenom_Ch + ", Diplome="
				+ Diplome + ", Numero_Tle_Ch=" + Numero_Tle_Ch + ", Email_Ch=" + Email_Ch + ", region_Ch=" + region_Ch
				+ ", CIN=" + CIN + ", compte=" + compte + ", couloir=" + couloir + "]";
	}
	
	


}
