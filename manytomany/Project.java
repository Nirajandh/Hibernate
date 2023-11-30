package com.hibernatejpa.hibernatejpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
public Project(int pid, String pname, List<Employee> emps) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.emps = emps;
	}
public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
@Id
	private int pid;
	private String pname;
	@ManyToMany
	private List<Employee> emps;
	
}
