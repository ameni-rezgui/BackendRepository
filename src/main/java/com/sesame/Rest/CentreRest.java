package com.sesame.Rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesame.DAO.Centre_Visite;
import com.sesame.MetierService.Centre_visiteMetierInterface;
@RestController
@RequestMapping("/Centre")
@CrossOrigin("*")
public class CentreRest {
	@Autowired
	private  Centre_visiteMetierInterface CF;
	
	
	
	
	@PostMapping("/add") 
	public void save(@RequestBody Centre_Visite centreVisite)
	
	{ 
	 
		CF.add(centreVisite);
	}
	
	@GetMapping("/get")
	public Collection<Centre_Visite> findALL()
	{
		return CF.getAll();
	}
	@GetMapping("/get/{id}")
	public Centre_Visite findById(@PathVariable Long id)
	{
		return CF.getId(id);
	}
	
	
	@DeleteMapping("/supprimer/{id}")
	public void supprimer(@PathVariable Long id) {
	
		CF.delete(id);
	}
	@PutMapping("edit/{id}")  // modification

	public Centre_Visite update(@PathVariable Long id , @RequestBody Centre_Visite centreVisite)
	
	{   try {
		centreVisite.setID_Centre(id);
		return CF.add(centreVisite)	;
		
	} catch (Exception e) {
             return null;

	}
		
	
	
	
		}
 
	
}
