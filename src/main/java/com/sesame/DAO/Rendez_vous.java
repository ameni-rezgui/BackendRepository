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

@Entity
public class Rendez_vous implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Centre_ID;
	
	 //@JsonFormat(pattern="HH:mm:ss")
	private  Date start;
	// @JsonFormat(pattern="HH:mm")
	private Date Heure;
	 @OneToOne
	 @JoinColumn(name="vehicule_id")
	 private vehicule vehicule;
	 
	 @OneToOne
	 @JoinColumn(name="couloir_id")
	 private couloir couloir;

}
