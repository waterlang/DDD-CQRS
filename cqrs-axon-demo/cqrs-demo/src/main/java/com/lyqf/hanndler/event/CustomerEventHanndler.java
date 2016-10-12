package com.lyqf.hanndler.event;

import org.axonframework.eventhandling.annotation.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lyqf.dto.CustomerDto;
import com.lyqf.event.CustomerCreatedEvent;
import com.lyqf.reposity.CustomerDtoReposity;

@Component
public class CustomerEventHanndler {

	@Autowired
	private CustomerDtoReposity customerDtoReposity;
	
	@EventHandler
	public void on(CustomerCreatedEvent event){
		CustomerDto dto = new CustomerDto();
		dto.setName(event.getName());
		dto.setPwd(event.getPwd());
		customerDtoReposity.save(dto);
	}
	
	
}
