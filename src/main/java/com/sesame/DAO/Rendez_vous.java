package com.sesame.DAO;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Rendez_vous implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Centre_ID;
	
	 //@JsonFormat(pattern="HH:mm:ss")
	private  Date start;
	// @JsonFormat(pattern="HH:mm")
	private Date Heure;
	@JsonIgnore
	 @OneToOne
	 @JoinColumn(name="vehicule_id")
	 private vehicule vehicule;
	@JsonIgnore
	 @OneToOne
	 @JoinColumn(name="couloir_id")
	 private couloir couloir;

	public long getCentre_ID() {
		return Centre_ID;
	}

	public void setCentre_ID(long centre_ID) {
		Centre_ID = centre_ID;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getHeure() {
		return Heure;
	}

	public void setHeure(Date heure) {
		Heure = heure;
	}

	public vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public couloir getCouloir() {
		return couloir;
	}

	public void setCouloir(couloir couloir) {
		this.couloir = couloir;
	}

}
