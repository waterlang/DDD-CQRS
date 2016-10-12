package com.lyqf.reposity;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lyqf.dto.CustomerDto;

public interface CustomerDtoReposity extends MongoRepository<CustomerDto, String>{

}
