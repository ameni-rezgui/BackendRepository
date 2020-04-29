package com.sesame.MetierService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sesame.DAO.Client;

@Service
public interface ClientMetierInterface {
	public List<Client> getAll();
	public Client getId(long id);
	public Optional<Client>    getName(String name); 
	public void delete(long id);
	public  Client add(Client client);

}
