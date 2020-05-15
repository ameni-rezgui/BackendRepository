package com.sesame.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.DAO.Client;
import com.sesame.MetierService.ClientMetierInterface;
import com.sesame.Repository.ClientRepository;
@Service
public class ClientMetierInterfaceImpl implements ClientMetierInterface {
  @Autowired
  private ClientRepository cr;
  @Transactional
	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}
  
	@Override
	public Client getId(long id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}
  
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);

	}
  
	@Override
	public Client add(Client client) {
		// TODO Auto-generated method stub
		return cr.save(client);
	}

	@Override
	public Optional<Client> getName(String name) {
		
		Optional<Client> client = cr.getname(name);
		return  client ;
	}

}
