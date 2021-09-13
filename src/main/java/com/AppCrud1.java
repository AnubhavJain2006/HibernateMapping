package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.manytomany.EmployeeBean;
import com.manytomany.ProjectBean;

public class AppCrud1 {

	public static void main(String[] args) {
		
		
		SessionFactory sf=new Configuration().configure("com/hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		
		
		EmployeeBean emp1=new EmployeeBean();
		EmployeeBean emp2=new EmployeeBean();
		EmployeeBean emp3=new EmployeeBean();
		EmployeeBean emp4=new EmployeeBean();
		
		emp1.setName("Utsav");
		emp2.setName("Anubhav");
		emp3.setName("Kaushal");
		emp4.setName("Shivam");
		
		ProjectBean p1=new ProjectBean();
		ProjectBean p2=new ProjectBean();
		ProjectBean p3=new ProjectBean();
		ProjectBean p4=new ProjectBean();
		
		p1.setProjectName("Web Development");
		p2.setProjectName("App Development");
		p3.setProjectName("AI");
		p4.setProjectName("Robotics");
		
		List<EmployeeBean> employees=new ArrayList<EmployeeBean>();
		
		List<ProjectBean> projectList1=new ArrayList<ProjectBean>();
		projectList1.add(p1);
		projectList1.add(p2);
		projectList1.add(p3);
		
		emp1.setProjects(projectList1);
		employees.add(emp1);
		employees.add(emp2);
		p1.setEmployees(employees);
		projectList1=new ArrayList<ProjectBean>();
		
		projectList1.add(p2);
		projectList1.add(p3);
		
		emp2.setProjects(projectList1);
		
		session.save(emp1);
		session.save(emp2);
		
		tx.commit();
	}
}
