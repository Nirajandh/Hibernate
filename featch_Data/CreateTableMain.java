package com.hibernatejpa.hibernatejpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;


// in xml  file replace create with update or it will delete the existing data and then continue remaining part

public class CreateTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // for connection
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
	
	    CreateTable obj=(CreateTable)session.get(CreateTable.class,1);  //create object of the table class to featch data
		
		System.out.println(obj.getCity());  // to avoid .getcity() override the string method from the create table class
		
		session.close();
		factory.close();
		}
		
	}


