<%@page import="java.util.Iterator"%>
<%@page import="com.codefiles.BookPojo"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.Query"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Information</title>
</head>
<body>
<%
	String isbn=request.getParameter("value");
	String hql="from BookPojo where isbn=:v";
	Session ses=new Configuration().configure().buildSessionFactory().openSession();
	Transaction tra=ses.beginTransaction();
	Query<BookPojo> query=ses.createQuery(hql);
	query.setParameter("v",isbn);
	
	Iterator<BookPojo> i1=query.iterate();
	BookPojo b;
	String bimg="";
	if(i1.hasNext())
	{
		 b=i1.next();
		bimg=b.getBimg();
	}
	%>
<form>
<center>
<img src="<%=bimg%>" height="350" width="250">
</center>
</form>	
</body>
</html>