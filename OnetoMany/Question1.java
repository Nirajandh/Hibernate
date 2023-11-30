package com.hibernatejpa.hibernatejpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question1 {

	@Id
	private int qid;
	private String que;
	@OneToMany(mappedBy = "qno")
	private List<Answer1>  ansno;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	public List<Answer1> getAnsno() {
		return ansno;
	}

	public void setAnsno(List<Answer1> ansno) {
		this.ansno = ansno;
	}

	public Question1(int qid, String que, List<Answer1> ansno) {
		super();
		this.qid = qid;
		this.que = que;
		this.ansno = ansno;
	}

	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
}
