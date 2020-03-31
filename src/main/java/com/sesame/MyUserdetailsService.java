package com.sesame;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.sesame.DAO.Client;
import com.sesame.MetierInterface.ClientMetierInterface;

public class MyUserdetailsService implements UserDetailsService {
 @Autowired
 ClientMetierInterface cl;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		 Optional<Client> user = cl.getName(username);
		 user.orElseThrow(()-> new UsernameNotFoundException("not found" + username));
		 return user.map(MyUserdetail::new).get();
	}

}
