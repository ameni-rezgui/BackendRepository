package com.sesame.DAO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

public class ReclamationGenerique implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Rec;
	private String msg;

	@ManyToOne
	@JoinColumn(name = "centre_visite_id")
	private Centre_Visite centre_Visite;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	public Long getId_Rec() {
		return Id_Rec;
	}
	public void setId_Rec(Long id_Rec) {
		Id_Rec = id_Rec;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Centre_Visite getCentre_Visite() {
		return centre_Visite;
	}
	public void setCentre_Visite(Centre_Visite centre_Visite) {
		this.centre_Visite = centre_Visite;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public ReclamationGenerique(Long id_Rec, String msg) {
		super();
		Id_Rec = id_Rec;
		this.msg = msg;
	
	}

	public ReclamationGenerique(Long id_Rec, String msg, Centre_Visite centre_Visite, Client client) {
		super();
		Id_Rec = id_Rec;
		this.msg = msg;
		this.centre_Visite = centre_Visite;
		this.client = client;
	}
	public ReclamationGenerique() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
