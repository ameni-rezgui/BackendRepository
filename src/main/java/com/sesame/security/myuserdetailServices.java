package com.sesame.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sesame.DAO.Client;
import com.sesame.MetierService.ClientMetierInterface;

@Service
public class myuserdetailServices implements UserDetailsService{
 @Autowired
 ClientMetierInterface cl_repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	   Optional<Client> user = cl_repo.getName(username);

	return user.map(Myuserdetails::new).get();
		
	}

}
