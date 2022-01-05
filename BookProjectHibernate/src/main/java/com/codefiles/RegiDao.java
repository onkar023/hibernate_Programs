package com.codefiles;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RegiDao {
	public String addUser(RegiPojo rpojo)
	{
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(rpojo);
		
		LoginPojo lpojo=new LoginPojo(rpojo.getEmail(),rpojo.getPwd());
		session.save(lpojo);
		transaction.commit();
		session.close();
		return "success";
	}

}
