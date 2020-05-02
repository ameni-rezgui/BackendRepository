package com.sesame.DAO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Message implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID_Message;
	private String Type_Message;
	private String Corps_message;
	@OneToOne
	private Client client;
	public long getID_Message() {
		return ID_Message;
	}
	public void setID_Message(long iD_Message) {
		ID_Message = iD_Message;
	}
	public String getType_Message() {
		return Type_Message;
	}
	public void setType_Message(String type_Message) {
		Type_Message = type_Message;
	}
	public String getCorps_message() {
		return Corps_message;
	}
	public void setCorps_message(String corps_message) {
		Corps_message = corps_message;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

}
