package com.codefiles;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookDao {
	public String addBook(BookPojo bpojo) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(bpojo);
		transaction.commit();
		session.close();
		return "success";
	}
}