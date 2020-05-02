package com.sesame.DAO;

public class UserDTO {
	private Client client;
	private String token;
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public UserDTO(Client client, String token) {
		super();
		this.client = client;
		this.token = token;
	}
	

}
