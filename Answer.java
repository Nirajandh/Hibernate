package com.hibernatejpa.hibernatejpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	private int ansid;
	private String ans;
	
	@OneToOne
	private Question que;
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getAns();
	}
public Question getQue() {
		return que;
	}
	public void setQue(Question que) {
		this.que = que;
	}
public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
public Answer(int ansid, String ans) {
		super();
		this.ansid = ansid;
		this.ans = ans;
	}
public int getAnsid() {
		return ansid;
	}
	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}


	
	
	
}
