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
	

}
