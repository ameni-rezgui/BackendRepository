package com.sesame.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Reclamation implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_Rec;
	private String Motife_Rec;
	private String Message_Rec;
	private String Piece_Jointe;
	@OneToMany(mappedBy = "reclamation")
	private List<vehicule> vehicules;
	@ManyToOne
	@JoinColumn(name = "centre_visite_id")
	private Centre_Visite centre_Visite;
	public int getId_Rec() {
		return Id_Rec;
	}
	public void setId_Rec(int id_Rec) {
		Id_Rec = id_Rec;
	}
	public String getMotife_Rec() {
		return Motife_Rec;
	}
	public void setMotife_Rec(String motife_Rec) {
		Motife_Rec = motife_Rec;
	}
	public String getMessage_Rec() {
		return Message_Rec;
	}
	public void setMessage_Rec(String message_Rec) {
		Message_Rec = message_Rec;
	}
	public String getPiece_Jointe() {
		return Piece_Jointe;
	}
	public void setPiece_Jointe(String piece_Jointe) {
		Piece_Jointe = piece_Jointe;
	}
	public List<vehicule> getVehicules() {
		return vehicules;
	}
	public void setVehicules(List<vehicule> vehicules) {
		this.vehicules = vehicules;
	}
	public Centre_Visite getCentre_Visite() {
		return centre_Visite;
	}
	public void setCentre_Visite(Centre_Visite centre_Visite) {
		this.centre_Visite = centre_Visite;
	}
	

}
