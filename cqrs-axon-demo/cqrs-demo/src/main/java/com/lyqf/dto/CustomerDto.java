package com.lyqf.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;


public class CustomerDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2453272753830310582L;

	@Id
	private String id;
	
	private String name;
	
	private String pwd;

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
