package com.sesame.Rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sesame.DAO.Client;
import com.sesame.DAO.UserDTO;
import com.sesame.security.JwtUtil;
import com.sesame.security.Myuserdetails;

@RestController
public class authenticationRest {
	
	@Autowired 
      private 	AuthenticationManager authenticationManager;
	@Autowired
	private JwtUtil jwtTokenUtil;
	@PostMapping("/login")
	public ResponseEntity<UserDTO> login(@RequestBody Client user ,HttpServletRequest resuest,HttpServletResponse response)
	{   try {
		
		  Authentication  authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getNom_CL(), user.getPassword()));
		  final Myuserdetails userdetail = (Myuserdetails)authentication.getPrincipal();
		  SecurityContextHolder.getContext().setAuthentication(authentication);
		  final String token =jwtTokenUtil.genereateTOken(userdetail);
		  response.setHeader("token", token);
		  return new  ResponseEntity<UserDTO>(new UserDTO(userdetail.getClient(),token),HttpStatus.OK);
	} catch (Exception e) {
           
	}
		
		
	   return null;
	
	}
}
