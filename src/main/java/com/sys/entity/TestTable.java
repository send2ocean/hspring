package com.sys.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "test1")
public class TestTable {
	
	private int id;
	private String name;
	private String lable;
	private String sexLable;
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
	public String getLable() {
		return lable;
	}
	public void setLable(String lable) {
		this.lable = lable;
	}
	public String getSexLable() {
		return sexLable;
	}
	public void setSexLable(String sexLable) {
		this.sexLable = sexLable;
	}
	
	

}
