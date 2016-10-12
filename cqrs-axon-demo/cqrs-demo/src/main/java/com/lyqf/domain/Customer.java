package com.lyqf.domain;

import java.io.Serializable;







import org.axonframework.eventhandling.annotation.EventHandler;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;
import org.axonframework.eventsourcing.annotation.EventSourcingHandler;

import com.lyqf.command.CreateCustomerCommand;
import com.lyqf.event.CustomerCreatedEvent;



public class Customer extends AbstractAnnotatedAggregateRoot<Customer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@AggregateIdentifier
	private String id;
	
	private String name;
	
	private String pwd;

	
	
	
	public  Customer(){
		
	}
	
	
	public  Customer(CreateCustomerCommand command){
		CustomerCreatedEvent event = new CustomerCreatedEvent();
		event.setId(command.getId());
		event.setName(command.getName());
		event.setPwd(command.getPwd());
		apply(event);
	}
	
	
	@EventSourcingHandler
	public void hand(CustomerCreatedEvent e){
		this.id = e.getId();
		this.name = e.getName();
		this.pwd = e.getPwd();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
}
