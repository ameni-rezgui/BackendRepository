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
import com.sesame.MetierService.MessageMetierInterface;

public class MessageRest {
	@Autowired
	private  MessageMetierInterface CF;
	
	
	@PostMapping("/add") 
	public void save(@RequestBody Message marque)
	
	{	CF.add(marque);
	}
	
	@GetMapping("/get")
	public Collection<Message> findALL()
	{
		return CF.getAll();
	}
	@GetMapping("/get/{id}")
	public Message findById(@PathVariable Long id)
	{
		return CF.getId(id);
	}
	
	
	@DeleteMapping("/supprimer/{id}")
	public void supprimer(@PathVariable Long id) {
	
		CF.delete(id);
	}
	@PutMapping("edit/{id}")  // modification

	public void update(@PathVariable Long id , @RequestBody Message marque)
	
	{
		marque.setID_Message(id);
		CF.add(marque)	;
	}
}
