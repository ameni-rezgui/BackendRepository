package com.sesame.MetierService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sesame.DAO.Message;
import com.sesame.DAO.Type_vehicule;
import com.sesame.DAO.vehicule;
@Service
public interface MessageMetierInterface {
	public Message getId(long id);
	public void delete(long id);
	public  Message add(Message Message);
	public List<Message> getAll();
}
