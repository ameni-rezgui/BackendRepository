package com.sesame.security;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.sesame.DAO.Client;

public class Myuserdetails implements UserDetails{
	private String usrename;
	private String password;
	private Client client;
	private  List<GrantedAuthority> authorities;
	public Myuserdetails(Client s) {
		this.usrename=s.getCompte().getLogin();
		this.password=s.getCompte().getPassword();
		this.authorities = Arrays.stream(s.getCompte().getRoles().split(","))
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
				
		
	}
	

	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return usrename;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
