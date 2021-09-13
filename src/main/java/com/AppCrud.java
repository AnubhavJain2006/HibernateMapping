package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetomany.AnswerBean;
import com.onetomany.QuestionBean;

public class AppCrud {

	public static void main(String[] args) {
		AnswerBean ans1=new AnswerBean();
		AnswerBean ans2=new AnswerBean();
		AnswerBean ans3=new AnswerBean();
		AnswerBean ans4=new AnswerBean();
		
		
		QuestionBean ques=new QuestionBean();
		ans1.setAnswer("f9");
		ans1.setQuestion(ques);
		ans2.setAnswer("Fine");
		ans2.setQuestion(ques);
		ans3.setAnswer("Maja ma");
		ans3.setQuestion(ques);
		ans4.setAnswer("Badhiya hai");
		ans4.setQuestion(ques);
		List<AnswerBean> list =new ArrayList<AnswerBean>();
		list.add(ans1);
		list.add(ans3);
		list.add(ans2);
		list.add(ans4);
		ques.setAnswers(list);
		ques.setQuestion("How are u??");
		SessionFactory sf= new Configuration().configure("com/hibernate.cfg.xml").buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
//		session.persist(ques);
		System.out.println("Session save method "+session.save(ques));
//		System.out.println("Session persist "+session.persist(ques));
//		session.save(ans1);
//		session.save(ans2);
//		session.save(ans3);
//		session.save(ans4);
		tx.commit();
		
		
		
		
		
	}
}
