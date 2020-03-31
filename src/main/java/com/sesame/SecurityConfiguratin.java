package com.sesame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

public class SecurityConfiguratin  extends WebSecurityConfigurerAdapter{
	@Autowired
	UserDetailsService userDetailsService;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
	auth.userDetailsService(userDetailsService);
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/USER").hasAnyRole("ADMIN","USER")
		.antMatchers("/ADMIN").hasRole("ADMIN")
		.antMatchers("/").permitAll()
		.and().formLogin();
	}

}
