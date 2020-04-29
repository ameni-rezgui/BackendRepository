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

@Entity
public class couloir implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Numero_Couloir;
	private Date Date_ouverture;
	private Date Date_fermeture;
  @OneToOne
   @JoinColumn(name="chef_couloir")
  private  Chef_couloir chef_couloir;
  @OneToOne(mappedBy = "couloir")
  private Centre_Visite centre_Visite;
  @ManyToOne(
			fetch = FetchType.LAZY)
  @JoinColumn(name = "type_vehicule_ID")
  private Type_vehicule type_vehicule;
  @OneToOne(mappedBy = "couloir")
  private Rendez_vous rendez_vous;

}
