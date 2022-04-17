package com.practice.CrudDemo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.CrudDemo.Repository.ClientRepository;
import com.practice.CrudDemo.model.Clients;

@Service
public class ClientService {
	
	@Autowired  
	ClientRepository clientRepository;  
	
	public List<Clients> getAllClients()   
	{  
	List<Clients> clients= new ArrayList<Clients>();  
	clientRepository.findAll().forEach(client -> clients.add(client));  
	return clients;  
	}  
	
	public void saveOrUpdate(Clients client)   
	{  
	clientRepository.save(client); 
	
	}

	public void delete(int clientid) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(clientid);
	}  


}
