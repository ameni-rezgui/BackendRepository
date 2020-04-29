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


}
