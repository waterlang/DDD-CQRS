package com.lyqf.hanndler;

import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lyqf.command.CreateCustomerCommand;
import com.lyqf.domain.Customer;

@Component
public class CustomerCommandHanndler {

	@Autowired
	@Qualifier("customerRepository")
	private  Repository<Customer> customerRepository;
	
	@CommandHandler
	public void handler(CreateCustomerCommand createCommand){
		Customer c = null;
		try{
		   c = customerRepository.load(createCommand.getId());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			if(c != null){
				
			}else{
				Customer webC = new Customer(createCommand);
				customerRepository.add(webC);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
