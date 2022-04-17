package com.practice.CrudDemo.Repository;

import org.springframework.data.repository.CrudRepository;


import com.practice.CrudDemo.model.Clients;


public interface ClientRepository extends CrudRepository<Clients, Integer>  {

	
}
