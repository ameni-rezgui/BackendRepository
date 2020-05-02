package com.sesame.DAO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Chef_couloir implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID_CL;

	private String Nom_Ch;
	private String Prenom_Ch;
	private String Diplome;
	@Column(name="num")
	private String  Numero_Tle_Ch;
	private String Email_Ch;
	private String Ville_Ch;
	@OneToOne
	@JoinColumn(name = "Compte_id")
	private Compte compte;
	@OneToOne(mappedBy = "chef_couloir")
	private couloir couloir;
	@OneToOne(mappedBy = "client")
	private Message message;
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
	public String getVille_Ch() {
		return Ville_Ch;
	}
	public void setVille_Ch(String ville_Ch) {
		Ville_Ch = ville_Ch;
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
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}


}
