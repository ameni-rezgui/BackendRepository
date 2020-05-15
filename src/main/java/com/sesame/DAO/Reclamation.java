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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Reclamation implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Rec;
	private String Motif_Rec;
	private String Message_Rec;
	private String Piece_Jointe;
	@JsonIgnore
	@OneToMany(mappedBy = "reclamation")
	private List<vehicule> vehicules;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "centre_visite_id")
	private Centre_Visite centre_Visite;
	public Long getId_Rec() {
		return Id_Rec;
	}
	public void setId_Rec(Long id_Rec) {
		Id_Rec = id_Rec;
	}
	public String getMotif_Rec() {
		return Motif_Rec;
	}
	public void setMotif_Rec(String motif_Rec) {
		Motif_Rec = motif_Rec;
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
