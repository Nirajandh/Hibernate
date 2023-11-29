package com.hibernatejpa.hibernatejpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// create table of employeeeeee
@Entity      // to set it as class name
@Table(name="Employeeeee")    //to chane the name of table
public class CreateTable {
    @Id    //to set it as aprimary key
    @GeneratedValue     //genewate values as per sequence automatically
	private int eid;
	@Column(length=50 , name="Name") //to change column name and set length limit
	private String ename;
	
	private String city;
	
	//generate getter and setter methods

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
// gennrate constructor for the fields
	public CreateTable(int eid, String ename, String city) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.city = city;
	}
//  genrate constructor for the super class
	public CreateTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
