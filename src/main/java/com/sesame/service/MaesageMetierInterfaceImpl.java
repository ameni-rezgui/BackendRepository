package com.sesame.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.DAO.Message;
import com.sesame.MetierService.MessageMetierInterface;

import com.sesame.Repository.Message_repository;

@Service
public class MaesageMetierInterfaceImpl implements MessageMetierInterface {

	@Autowired
	private Message_repository vr;
	@Transactional
	@Override
	public List<Message> getAll() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}
	@Transactional
	@Override
	public Message getId(long id) {
		// TODO Auto-generated method stub
		return vr.findById(id).get();
	}
	@Transactional
	@Override
	public void delete(long id) {
               vr.deleteById(id);		
	}
	@Transactional
	@Override
	public Message add(Message Message) {
		// TODO Auto-generated method stub
		return vr.save(Message);
	}

}
