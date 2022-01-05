package com.codefiles;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoginDao {
	public String validateUser(LoginPojo lpojo)
	{
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		String hql="from LoginPojo where uname=:v1 and pwd=:v2";
		Query query=session.createQuery(hql);
		query.setParameter("v1",lpojo.getUname());
		query.setParameter("v2",lpojo.getPwd());
		List<LoginPojo> list=query.list();
		if(list.isEmpty())
		{
			transaction.commit();
			session.close();
			return "error";
		}
		else
		{
			transaction.commit();
			session.close();
			return "success";
		}
		
	}

}
