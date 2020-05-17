package com.sesame.DAO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Rendez_vous implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idr;
	private  Date start;
	private String Heure;
	 @JsonIgnore
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="vehicule_id")
	 private vehicule vehicule;
	 
	 @ManyToOne
	 @JoinColumn(name="Centre")
	 private Centre_Visite centre_Visite;

	public long getIdr() {
		return idr;
	}

	public void setIdr(long idr) {
		this.idr = idr;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public String getHeure() {
		return Heure;
	}

	public void setHeure(String heure) {
		Heure = heure;
	}

	public vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(vehicule vehicule) {
		this.vehicule = vehicule;
	}
	
	public Centre_Visite getCentre_Visite() {
		return centre_Visite;
	}

	public void setCentre_Visite(Centre_Visite centre_Visite) {
		this.centre_Visite = centre_Visite;
	}

	public Rendez_vous(long idr, Date start, String heure, com.sesame.DAO.vehicule vehicule,
			Centre_Visite centre_Visite) {
		super();
		this.idr = idr;
		this.start = start;
		Heure = heure;
		this.vehicule = vehicule;
		this.centre_Visite = centre_Visite;
	}

	public Rendez_vous() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
