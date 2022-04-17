package com.practice.CrudDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table	
public class Clients {

	@Id
	@Column
	private int clientID;
	@Column
	private String clientName;
	@Column
	private String clientLoc;
	
	public int getClientID() {
		return clientID;
	}
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}
	public String getClientLoc() {
		return clientLoc;
	}
	public void setClientLoc(String clientLoc) {
		this.clientLoc = clientLoc;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
			
}
