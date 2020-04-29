package com.sesame.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Type_vehicule implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID_Type;
	private String Nom_Type;
	private String Carroserie;
	private String Genre;
	@OneToMany
	private List<vehicule> vehicules;
	@OneToMany(mappedBy = "type_vehicule")
	private List<couloir> couloirs;

}
