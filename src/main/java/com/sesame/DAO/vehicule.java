package com.sesame.DAO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class vehicule implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID_V;
	private String Matricule_V;
    private Date Date_Sortie_V;
    private int Age_V;
    private int Kilometrage;
    private int Nbr_Cylindre;
    private String Numero_carteGris_V;
    private String Numero_chassis_V;
    private String Energie_V;
    private String Puisance_Fiscale_v;
    private String Compagnie_assurance_v;
    private int Prix_achat_V;
    private int Poids_V;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Client_Id")
    private Client client;
    @JsonIgnore
    @ManyToOne
	@JoinColumn(name = "Relamation_id")
    private Reclamation reclamation;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "marque_id")
    private Marque marque;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "type_vehicule_id")
    private Type_vehicule type_vehicule;
    @JsonIgnore
    @OneToOne(mappedBy = "vehicule")
    private Rendez_vous renRendez_vous;
	public long getID_V() {
		return ID_V;
	}
	public void setID_V(long iD_V) {
		ID_V = iD_V;
	}
	public String getMatricule_V() {
		return Matricule_V;
	}
	public void setMatricule_V(String matricule_V) {
		Matricule_V = matricule_V;
	}
	public Date getDate_Sortie_V() {
		return Date_Sortie_V;
	}
	public void setDate_Sortie_V(Date date_Sortie_V) {
		Date_Sortie_V = date_Sortie_V;
	}
	public int getAge_V() {
		return Age_V;
	}
	public void setAge_V(int age_V) {
		Age_V = age_V;
	}
	public int getKilometrage() {
		return Kilometrage;
	}
	public void setKilometrage(int kilometrage) {
		Kilometrage = kilometrage;
	}
	public int getNbr_Cylindre() {
		return Nbr_Cylindre;
	}
	public void setNbr_Cylindre(int nbr_Cylindre) {
		Nbr_Cylindre = nbr_Cylindre;
	}
	public String getNumero_carteGris_V() {
		return Numero_carteGris_V;
	}
	public void setNumero_carteGris_V(String numero_carteGris_V) {
		Numero_carteGris_V = numero_carteGris_V;
	}
	public String getNumero_chassis_V() {
		return Numero_chassis_V;
	}
	public void setNumero_chassis_V(String numero_chassis_V) {
		Numero_chassis_V = numero_chassis_V;
	}
	public String getEnergie_V() {
		return Energie_V;
	}
	public void setEnergie_V(String energie_V) {
		Energie_V = energie_V;
	}
	public String getPuisance_Fiscale_v() {
		return Puisance_Fiscale_v;
	}
	public void setPuisance_Fiscale_v(String puisance_Fiscale_v) {
		Puisance_Fiscale_v = puisance_Fiscale_v;
	}
	public String getCompagnie_assurance_v() {
		return Compagnie_assurance_v;
	}
	public void setCompagnie_assurance_v(String compagnie_assurance_v) {
		Compagnie_assurance_v = compagnie_assurance_v;
	}
	public int getPrix_achat_V() {
		return Prix_achat_V;
	}
	public void setPrix_achat_V(int prix_achat_V) {
		Prix_achat_V = prix_achat_V;
	}
	public int getPoids_V() {
		return Poids_V;
	}
	public void setPoids_V(int poids_V) {
		Poids_V = poids_V;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Reclamation getReclamation() {
		return reclamation;
	}
	public void setReclamation(Reclamation reclamation) {
		this.reclamation = reclamation;
	}
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	public Type_vehicule getType_vehicule() {
		return type_vehicule;
	}
	public void setType_vehicule(Type_vehicule type_vehicule) {
		this.type_vehicule = type_vehicule;
	}
	public Rendez_vous getRenRendez_vous() {
		return renRendez_vous;
	}
	public void setRenRendez_vous(Rendez_vous renRendez_vous) {
		this.renRendez_vous = renRendez_vous;
	}
    

}
