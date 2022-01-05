<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddBook</title>
</head>
<body>
<form>
	<table>
		<tr>
			<th>Isbn NO:</th>
			<td><input type="text" name="isbn"></td>
		</tr>
		<tr>
			<th>Book Name:</th>
			<td><input type="text" name="bname"></td>
		</tr>
		<tr>
			<th>Book Author:</th>
			<td><input type="text" name="bauthor"></td>
		</tr>
		<tr>
			<th>Book Price:</th>
			<td><input type="text" name="bprice"></td>
		</tr>
		<tr>
			<th>Book Publication:</th>
			<td><input type="text" name="bpubl"></td>
		</tr>
		<tr>
			<th>Book Image:</th>
			<td><input type="file" name="bimg" accept=".jpg,.png"></td>
		</tr>
		<tr>
			<th><input type="submit" value="AddBook" onclick="document.forms[0].action='BookCtrl';return true"></th>
			<td><input type="submit" value="Cancel" onclick="document.forms[0].action='Menu.jsp';return true"></td>
		</tr>
	</table>
	</form>
</body>
</html>