package com.sesame.DAO;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class couloir implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Numero_Couloir;
	private Date Date_ouverture;
	private Date Date_fermeture;

  @OneToOne
   @JoinColumn(name="chef_couloir")
  private  Chef_couloir chef_couloir;

  @ManyToOne
@JoinColumn(name = "Centre")
  private Centre_Visite centre_Visite;

  @ManyToOne
  @JoinColumn(name = "type_vehicule_ID")
  private Type_vehicule type_vehicule;

public long getNumero_Couloir() {
	return Numero_Couloir;
}

public void setNumero_Couloir(long numero_Couloir) {
	Numero_Couloir = numero_Couloir;
}

public Date getDate_ouverture() {
	return Date_ouverture;
}

public void setDate_ouverture(Date date_ouverture) {
	Date_ouverture = date_ouverture;
}

public Date getDate_fermeture() {
	return Date_fermeture;
}

public void setDate_fermeture(Date date_fermeture) {
	Date_fermeture = date_fermeture;
}

public Chef_couloir getChef_couloir() {
	return chef_couloir;
}

public void setChef_couloir(Chef_couloir chef_couloir) {
	this.chef_couloir = chef_couloir;
}

public Centre_Visite getCentre_Visite() {
	return centre_Visite;
}

public void setCentre_Visite(Centre_Visite centre_Visite) {
	this.centre_Visite = centre_Visite;
}

public Type_vehicule getType_vehicule() {
	return type_vehicule;
}

public void setType_vehicule(Type_vehicule type_vehicule) {
	this.type_vehicule = type_vehicule;
}

public couloir(long numero_Couloir, Date date_ouverture, Date date_fermeture, Chef_couloir chef_couloir,
		Centre_Visite centre_Visite, Type_vehicule type_vehicule) {
	super();
	Numero_Couloir = numero_Couloir;
	Date_ouverture = date_ouverture;
	Date_fermeture = date_fermeture;
	this.chef_couloir = chef_couloir;
	this.centre_Visite = centre_Visite;
	this.type_vehicule = type_vehicule;
}

public couloir() {
	super();
	// TODO Auto-generated constructor stub
}



}
