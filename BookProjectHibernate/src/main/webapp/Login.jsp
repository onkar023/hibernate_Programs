<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Page</title>
<style>
#bgimgprop {
	background-image: url("D:/img/Ancient.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-position: center;
	background-size: 100%;
}
</style>
</head>
<body id="bgimgprop">
	<form action="LoginCtrl" method="post">
	<center><h4><font color="white" face="Arial">Login Details!!!</font></h4></td></tr></center>
			
		<table align="center">
			<tr>
				<th><font color="white" face="Arial">Username:</font></th>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<th><font color="white" face="Arial">Password:</font></th>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<th><input type="submit" value="Login"></th>
				<td><a href="Register.jsp"><font color="white" face="Arial">NewUser?RegisterHere!!</font></a></td>
			</tr>
		</table>
	</form>
</body>
</html>