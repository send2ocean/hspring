package com.sys.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

 
@Entity
@Table(name = "txl")
public class Txl implements Serializable {
	 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String dept;
	
	private String post;
	
	private Long sortNo;
	
	private String name;
	
	private Long mobilPhoneNo;
	
	private String email;
	
	private String telNo;
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}
	public Long getSortNo() {
		return sortNo;
	}

	public void setSortNo(Long sortNo) {
		this.sortNo = sortNo;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Long getMobilPhoneNo() {
		return mobilPhoneNo;
	}

	public void setMobilPhoneNo(Long mobilPhoneNo) {
		this.mobilPhoneNo = mobilPhoneNo;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	
	

}
