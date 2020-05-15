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
	private String Date_ouverture;
	private String Date_fermeture;
	@JsonIgnore
  @OneToOne
   @JoinColumn(name="chef_couloir")
  private  Chef_couloir chef_couloir;
	@JsonIgnore
  @OneToOne(mappedBy = "couloir")
  private Centre_Visite centre_Visite;
	@JsonIgnore
  @ManyToOne(
			fetch = FetchType.LAZY)
  @JoinColumn(name = "type_vehicule_ID")
  private Type_vehicule type_vehicule;
	@JsonIgnore
  @OneToOne(mappedBy = "couloir")
  private Rendez_vous rendez_vous;

public long getNumero_Couloir() {
		return Numero_Couloir;
	}
	public void setNumero_Couloir(long numero_Couloir) {
		Numero_Couloir = numero_Couloir;
	}
public String getDate_ouverture() {
	return Date_ouverture;
}
public void setDate_ouverture(String date_ouverture) {
	Date_ouverture = date_ouverture;
}
public String getDate_fermeture() {
	return Date_fermeture;
}
public void setDate_fermeture(String date_fermeture) {
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
public Rendez_vous getRendez_vous() {
	return rendez_vous;
}
public void setRendez_vous(Rendez_vous rendez_vous) {
	this.rendez_vous = rendez_vous;
}

}
