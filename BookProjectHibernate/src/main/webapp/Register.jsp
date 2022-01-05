<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form action="RegisterCtrl" method="post">
		<table>
			<tr>
				<th>Name:</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>Email:</th>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<th>Gender:</th>
				<td><input type="checkbox" name="gender" value="Male">Male
					<input type="checkbox" name="gender" value="Female">Female
					<input type="checkbox" name="gender" value="Other">Other
				</td>
			</tr>
			<tr>
				<th>Country:</th>
				<td><input type="text" name="country" value="India"></td>
			</tr>
			<tr>
				<th>Phone NO:</th>
				<td><input type="text" name="phno"></td>
			</tr>
			<tr>
				<th><input type="submit" value="Register"></th>
			</tr>
		</table>
	</form>
</body>
</html>