package com.gontuseries.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Main {

	public static void main(String[] args) {
		
		
		// Write the Student_Info object into the database
		Student_Info student1 = new Student_Info();
		student1.setName("Gontu1");

		Student_Info student2 = new Student_Info();
		student2.setName("Gontu2");

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// this would save the Student_Info object into the database
		session.save(student1);
		
		// this would save the Student_Info object into the database
		session.save(student2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
