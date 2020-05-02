package com.sesame.security;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
@Service
public class JwtUtil {
	static final  String CLAM_KEY_USERNAME="sub";
	static final  String CLAM_KEY_AUDIENCE ="audience";
	static final  String CLAM_KEY_CREATED="created";
	static final String SECRET="mlfdkgdfg7f5643fd1greg";
	static final Long Expiration=333600L;
	
	
	
	public String genereateTOken(Myuserdetails userdetail) {
		    Map<String ,Object> claims = new HashMap<String, Object>() ;
		    claims.put(CLAM_KEY_USERNAME, userdetail.getUsername());
		    claims.put(CLAM_KEY_CREATED, new Date());
			return genereateTOken(claims);
		}
	private String genereateTOken(Map<String, Object> claims) {
		
		return Jwts.builder()
				.setClaims(claims)
				.setExpiration(genreateExpiration())
				.signWith(SignatureAlgorithm.HS512, SECRET)
				.compact();
	}
	public Date genreateExpiration() {

		return new Date(System.currentTimeMillis()+Expiration*1000);
	}
	
	public String getUserNameFromToken(String token)
	
	{
		String UserName=null;
		try {
			    Claims claims = getClaimsFromTOken(token);
			   
			    UserName=claims.getSubject();
			
			
			
		} catch (Exception e) {

		       return null;
		}
		return UserName;
	}
	private Claims getClaimsFromTOken(String token) {
		
		Claims claims = null;
		try {
			
			claims =Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody();
			
			
		} catch (Exception e) {
   
		       return null;
		}
		return claims;
	}
	
	public boolean IsValide(String token , UserDetails userdetail) {
		Myuserdetails user = (Myuserdetails)userdetail;
		String username = getUserNameFromToken(token);
		return (username.equals(user.getPassword())&&IstokenExpidre(token));
		
	}
	private boolean IstokenExpidre(String token) {
 
		final Date Expiration = getExpirationDateFromTOken(token);
		return Expiration.before(new Date());
	}
	private Date getExpirationDateFromTOken(String token) {
     Date expiration = null;
		try {
			Claims claims = getClaimsFromTOken(token);
			   if (claims != null)
			   {
				   expiration = claims.getExpiration();
			   }
			   else return null;
			
			
			
		} catch (Exception e) {
			return null;
 
		}
		
		
		return expiration;
	}
	
}
