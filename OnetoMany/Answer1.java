package com.hibernatejpa.hibernatejpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer1 {

	@Id
	private int aid;
	private String ans;
	@ManyToOne
	private Question1 qno;
	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer1(int aid, String ans, Question1 qno) {
		super();
		this.aid = aid;
		this.ans = ans;
		this.qno = qno;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Question1 getQno() {
		return qno;
	}
	public void setQno(Question1 qno) {
		this.qno = qno;
	}
}
