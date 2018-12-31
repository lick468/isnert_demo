package com.nenu.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class User implements Serializable{
	
	private static final long serialVersionUID = 6777870445002691891L;
	@Id
	@GeneratedValue
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
