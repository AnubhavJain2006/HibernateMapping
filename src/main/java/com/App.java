package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetoone.Answer;
import com.onetoone.Question;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Question ques=new Question();
        Answer ans=new Answer();
        
        ques.setQuestion("What is your name?");
        ans.setAnswer("Anubhav");
        ques.setAnswer(ans);
        ans.setQuestion(ques);
        
        SessionFactory sf=new Configuration().configure("com/hibernate.cfg.xml").buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(ques);
        session.save(ans);
        tx.commit();
    }
}
