package com.hibernatejpa.hibernatejpa;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// class employee and project
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();

		// creating employee table
		Employee e=new Employee();
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e.setEid(101);
		e.setEname("niranjan");
		
		e1.setEid(102);
		e1.setEname("deepak");
		
		e2.setEid(103);
		e2.setEname("omkar");
		
		// creating project object
		
		Project p=new Project();
		Project p1=new Project();		
		Project p2=new Project();
		Project p3=new Project();
		Project p4=new Project();
		
		p.setPid(1);
		p.setPname("library");
		
		p1.setPid(2);
		p1.setPname("chatbox");
		
		p2.setPid(3);
		p2.setPname("ecom");
		
		p3.setPid(4);
		p3.setPname("school");
		
		p4.setPid(5);
		p4.setPname("onlinne");
		
		List<Employee> l=new ArrayList<Employee>();
		List<Project> l2=new ArrayList<Project>();
		
		l.add(e);
		l.add(e1);
		
		l2.add(p);
		l2.add(p1);
		
		e.setProjects(l2);
		p.setEmps(l);
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(e);s.save(e1);s.save(e2);
		s.save(p);s.save(p1);s.save(p2);s.save(p3);s.save(p4);
		tx.commit();
		s.close();
		sf.close();
	}

}
