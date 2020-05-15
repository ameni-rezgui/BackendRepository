package com.sesame.DAO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Compte implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String Login;
	private String password;
	private String roles;
	private boolean Active;
	@JsonIgnore
	@OneToOne(mappedBy = "compte")
	private Client client;
	@JsonIgnore
	@OneToOne(mappedBy = "compte")
	private Chef_couloir chef_coloir;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public boolean isActive() {
		return Active;
	}
	public void setActive(boolean active) {
		Active = active;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Chef_couloir getChef_coloir() {
		return chef_coloir;
	}
	public void setChef_coloir(Chef_couloir chef_coloir) {
		this.chef_coloir = chef_coloir;
	}
	public Compte(long id, String login, String password, String roles, boolean active, Client client,
			Chef_couloir chef_coloir) {
		super();
		this.id = id;
		Login = login;
		this.password = password;
		this.roles = roles;
		Active = active;
		this.client = client;
		this.chef_coloir = chef_coloir;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Compte [id=" + id + ", Login=" + Login + ", password=" + password + ", roles=" + roles + ", Active="
				+ Active + ", client=" + client + ", chef_coloir=" + chef_coloir + "]";
	}
	

}
