package com.sesame.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Centre_Visite implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID_Centre;
	private String Nom_Centre;
	private String Region_Centre;
	private int Longitude;
	private int laltitude ;
	private int Nomber_Couloir;
	@OneToMany(
			mappedBy = "centre_Visite",
			fetch = FetchType.LAZY
			)
	private List<Reclamation> reclamation;
    @OneToOne(cascade = CascadeType.ALL)
    private couloir couloir;
    @ManyToMany(
			fetch = FetchType.LAZY)
	@JoinTable(
			name="Centre_Visite_Date_De_Travail",

			joinColumns=@JoinColumn(name="Centre_Visite_id"),
			inverseJoinColumns =@JoinColumn(name="Date_De_Travails_id")
		
			)
private List<Date_De_Travail> Date_De_Travails;
    
    
    
	public long getID_Centre() {
		return ID_Centre;
	}
	public void setID_Centre(long iD_Centre) {
		ID_Centre = iD_Centre;
	}
	public String getNom_Centre() {
		return Nom_Centre;
	}
	public void setNom_Centre(String nom_Centre) {
		Nom_Centre = nom_Centre;
	}
	public String getRegion_Centre() {
		return Region_Centre;
	}
	public void setRegion_Centre(String region_Centre) {
		Region_Centre = region_Centre;
	}
	public int getLongitude() {
		return Longitude;
	}
	public void setLongitude(int longitude) {
		Longitude = longitude;
	}
	public int getLaltitude() {
		return laltitude;
	}
	public void setLaltitude(int laltitude) {
		this.laltitude = laltitude;
	}
	public int getNomber_Couloir() {
		return Nomber_Couloir;
	}
	public void setNomber_Couloir(int nomber_Couloir) {
		Nomber_Couloir = nomber_Couloir;
	}
	public List<Reclamation> getReclamation() {
		return reclamation;
	}
	public void setReclamation(List<Reclamation> reclamation) {
		this.reclamation = reclamation;
	}
	public couloir getCouloir() {
		return couloir;
	}
	public void setCouloir(couloir couloir) {
		this.couloir = couloir;
	}
	public Centre_Visite(long iD_Centre, String nom_Centre, String region_Centre, int longitude, int laltitude,
			int nomber_Couloir, List<Reclamation> reclamation, com.sesame.DAO.couloir couloir,
			List<Date_De_Travail> date_De_Travails) {
		super();
		ID_Centre = iD_Centre;
		Nom_Centre = nom_Centre;
		Region_Centre = region_Centre;
		Longitude = longitude;
		this.laltitude = laltitude;
		Nomber_Couloir = nomber_Couloir;
		this.reclamation = reclamation;
		this.couloir = couloir;
		Date_De_Travails = date_De_Travails;
	}
	public Centre_Visite() {
		
	}
	
    
}
