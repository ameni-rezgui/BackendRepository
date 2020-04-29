package com.sesame.DAO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Compte implements Serializable {
	@Id
	private long id;
	private String Login;
	private String password;
	private String roles;
	private boolean Active;
	@OneToOne(mappedBy = "compte")
	private Client client;
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
	

}
