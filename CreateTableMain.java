package com.hibernatejpa.hibernatejpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // for connection
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		//System.out.println(sec); to check weather our connection is successfull or not
		
		CreateTable obj=new CreateTable();		
		obj.setEid(1);
		obj.setEname("niranjan");
		obj.setCity("pune");
		
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(obj);
		tx.commit();
		session.close();
		
		}
		
	}


