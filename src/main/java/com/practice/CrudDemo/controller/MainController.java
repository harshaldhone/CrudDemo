package com.practice.CrudDemo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.CrudDemo.Services.ClientService;
import com.practice.CrudDemo.model.Clients;

@RestController
public class MainController {
	

	@Autowired
	ClientService clientService;

	@RequestMapping("/homepage")
	public String homepage() {
		return "Hello World";
	}
	
	@GetMapping("/list")  
	private List<Clients> getAllClients()   
	{  
	return clientService.getAllClients();  
	}  
	
	@PostMapping("/addclient")
	private int saveClientData(@RequestBody Clients client) {
		clientService.saveOrUpdate(client);
		return client.getClientID();		
	}
	
	@DeleteMapping("/list/{clientid}")
	private void deleteClient(@PathVariable("clientid") int cliid) {
		clientService.delete(cliid);
	}
	
	
	 
}
