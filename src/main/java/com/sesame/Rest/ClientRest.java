package com.sesame.Rest;

import java.util.Collection;
import java.util.Optional;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesame.DAO.Client;
import com.sesame.MetierService.ClientMetierInterface;
import com.sesame.Repository.ClientRepository;



@RestController
@RequestMapping("/Client")
@CrossOrigin(origins = "*")
public class ClientRest {
	@Autowired
	private  ClientMetierInterface CF;
	@Autowired
   private ClientRepository cr;	
	
	@PostMapping("/add") 
	public void save(@RequestBody Client client)
	
	{	CF.add(client);
	}
	
	@GetMapping("/get")
	public Collection<Client> findALL()
	{
		return CF.getAll();
	}
	@GetMapping("/get/{id}")
	public Client findById(@PathVariable Long id)
	{
		return CF.getId(id);
	}

	
	
	@DeleteMapping("/supprimer/{id}")
	public void supprimer(@PathVariable Long id) {
	
		CF.delete(id);
	}
	@PutMapping("edit/{id}")  // modification

	public void update(@PathVariable Long id , @RequestBody Client client)
	
	{
		client.setID_CL(id);
		CF.add(client)	;
	}
	
}