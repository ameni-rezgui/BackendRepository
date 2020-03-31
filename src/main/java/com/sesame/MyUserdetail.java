package com.sesame;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.sesame.DAO.Client;

public class MyUserdetail implements UserDetails{
	private String userName;
	private String password;
	private boolean active;
	private List<GrantedAuthority> authoroties;
	public MyUserdetail(Client cl) {
		this.userName=cl.getNomC();
		this.password=cl.getCompte().getMdp();
		this.active=cl.getActive();
		this.authoroties=Arrays.stream(cl.getCompte().getRole().split(","))
		.map(SimpleGrantedAuthority::new)
		.collect(Collectors.toList());
		 	
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authoroties;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
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
		return active;
	}

}
