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


import com.sesame.DAO.ReclamationGenerique;
import com.sesame.MetierService.ReclamationG_MetierInterface;


@RestController
@RequestMapping("/ReclamationG")
@CrossOrigin("*")
public class ReclamationGRest {
	
	@Autowired
	private  ReclamationG_MetierInterface CF;
	
	
	@PostMapping("/add") 
	public void save(@RequestBody ReclamationGenerique Reclamation)
	
	{	CF.add(Reclamation);
	}
	
	@GetMapping("/get")
	public Collection<ReclamationGenerique> findALL()
	{
		return CF.getAll();
	}
	@GetMapping("/get/{id}")
	public ReclamationGenerique findById(@PathVariable Long id)
	{
		return CF.getId(id);
	}
	
	
	@DeleteMapping("/supprimer/{id}")
	public void supprimer(@PathVariable Long id) {
	
		CF.delete(id);
	}
	
	@PutMapping("edit/{id}")  // modification
	public void update(@PathVariable long id , @RequestBody ReclamationGenerique Reclamation)
	
	{
		Reclamation.setId_Rec(id);
		CF.add(Reclamation)	;
	}

	

}
