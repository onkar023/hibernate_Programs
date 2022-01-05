<%@page import="com.codefiles.BookPojo"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books Available</title>
</head>
<body>
<%
Session hibersession=new Configuration().configure().buildSessionFactory().openSession();
Transaction transaction=hibersession.beginTransaction();
String hql="from BookPojo";
Query query=hibersession.createQuery(hql);
List<BookPojo> list=query.list();
for(BookPojo b:list)
{
	String bimg=b.getBimg();
	String isbn=b.getIsbn();
	%>
	<a href="BookDetails.jsp"?value="<%=isbn%>"><img src="<%=bimg%>" height="250" width="150"></a>
	<%
}
%>
</body>
</html>