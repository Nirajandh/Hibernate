package com.hibernatejpa.hibernatejpa;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

// take special care of create and update in xml file .
// create .. creates new by deleting existing 
// update .. pudates in the same 

public class OneToMany {

	public static void main(String[] args) {
		
		
		
		// classes used question1 and answer1
		

		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		
		
		
	//creating question1
		Question1 q=new Question1();
		q.setQid(2);
	    q.setQue("what is linux");
		
		
//		//creating answer1
		
		Answer1 a=new Answer1();
	    a.setAid(14);
		a.setAns("os");
		a.setQno(q);
//	
//		
		Answer1 a1=new Answer1();
	    a1.setAid(15);
		a1.setAns("simple");
		a1.setQno(q);
		
		Answer1 a2=new Answer1();
	    a2.setAid(17);
		a2.setAns("unix based");
		a2.setQno(q);
//		
//		
		List<Answer1> l=new ArrayList<Answer1>();
		l.add(a);
		l.add(a1);
		l.add(a2);
//		
//		
		q.setAnsno(l);                   // pass list in question  many to one
		
	
		
		
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		

		
		s.save(q);s.save(a);s.save(a1);s.save(a2);
		
	
//		Question1 q=(Question1)s.get(Question1.class, 1);
//		System.out.println(q.getQid());
//		System.out.println(q.getQue());
//		for (Answer1 a:q.getAnsno())
//		{
//			System.out.println(a.getAns());
//		}
		tx.commit();
		s.close();
		
		sf.close();
	}
}



/* mysql output will be asfowwows
mysql> select * from answer1;
+-----+----------------------+---------+
| aid | ans                  | qno_qid |
+-----+----------------------+---------+
|  10 | programming language |       1 |
|  11 | simple               |       1 |
|  12 | opps                 |       1 |
|  14 | os                   |       2 |
|  15 | simple               |       2 |
|  17 | unix based           |       2 |
+-----+----------------------+---------+
6 rows in set (0.00 sec)

mysql> select * from question1;
+-----+---------------+
| qid | que           |
+-----+---------------+
|   1 | what is java  |
|   2 | what is linux |
+-----+---------------+



to retrive the data

Question1 q=(Question1)s.get(Question1.class, 1);
		System.out.println(q.getQid());
		System.out.println(q.getQue());
		for (Answer1 a:q.getAnsno())
		{
			System.out.println(a.getAns());
		}


		*/