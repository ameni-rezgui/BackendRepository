package com.sesame.Rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sesame.DAO.Message;
import com.sesame.DAO.Type_vehicule;
import com.sesame.MetierService.Type_vehiculeMetierInterface;

public class Type_vehiculeRest {
	@Autowired
	private Type_vehiculeMetierInterface CF;
	
	
	@PostMapping("/add") 
	public void save(@RequestBody Type_vehicule Type_vehicule)
	
	{	CF.add(Type_vehicule);
	}
	
	@GetMapping("/get")
	public Collection<Type_vehicule> findALL()
	{
		return CF.getAll();
	}
	@GetMapping("/get/{id}")
	public Type_vehicule findById(@PathVariable Long id)
	{
		return CF.getId(id);
	}
	
	
	@DeleteMapping("/supprimer/{id}")
	public void supprimer(@PathVariable Long id) {
	
		CF.delete(id);
	}
	@PutMapping("edit/{id}")  // modification

	public void update(@PathVariable Long id , @RequestBody Type_vehicule Type_vehicule)
	
	{
		Type_vehicule.setID_Type(id);
		CF.add(Type_vehicule)	;
	}

}
