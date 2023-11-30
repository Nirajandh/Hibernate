package com.hibernatejpa.hibernatejpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// classes used question and answer
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		
		
		//creating question1
				Question q1=new Question();
				q1.setQid(1);
				q1.setQue("what is c");
			
				
				
				//creating answer1
				
		   	   Answer a1=new Answer();
				a1.setAnsid(114);
				a1.setAns("basic programoing language");
				a1.setQue(q1);
				
			q1.setAns(a1);
			

//			//creating question2
					Question q2=new Question();
					q2.setQid(2);
					q2.setQue("what is linux");
				
					
//					
//					//creating answer2
					
					Answer a2=new Answer();
					a2.setAnsid(111);
					a2.setAns("operating system");
					a2.setQue(q2);
					
				q2.setAns(a2);
		
		
     // creating question3
		Question q3=new Question();
		q3.setQid(4);
		q3.setQue("what is java languge");
	
		
		
//		//creating answer3
		
		Answer a3=new Answer();
		a3.setAnsid(116);
		a3.setAns("programming language");
		a3.setQue(q3);
		
	q3.setAns(a3);

		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		//  retrive or fatch the data
		
	//	Question q=(Question)s.get(Question.class, 1);
		
		//System.out.println(q.getQue()+q.getAns());

		s.save(q3);
		s.save(a3);
		s.save(q1);
		s.save(a1);
		s.save(q2);
		s.save(a2);
		tx.commit();
		s.close();
		sf.close();
	}

}
