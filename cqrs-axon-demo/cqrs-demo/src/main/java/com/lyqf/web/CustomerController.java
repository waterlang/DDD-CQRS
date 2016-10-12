package com.lyqf.web;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyqf.command.CreateCustomerCommand;

@Controller
public class CustomerController {
		
	@Autowired
	private CommandGateway commandGateway;
	
	@RequestMapping("/test/save")
	@ResponseBody
	public String save(){
		CreateCustomerCommand createCommand = new CreateCustomerCommand();
		createCommand.setId("2222333");
		createCommand.setName("hehe");
		createCommand.setPwd("4234234");
		commandGateway.send(createCommand);
		return "success";
	}
}
