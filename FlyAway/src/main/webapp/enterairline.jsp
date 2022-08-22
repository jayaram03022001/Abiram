<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="right">
<a href="Adminlogout">Admin Logout</a>
</div>
<center>
<div style="border:3px solid black;width:25%;border-radius:20px;padding:20px" align="center">
<form action=insertairline method=post>
	<label for=id>Airline ID :-</label> <input type="id" name=id id=id /><br><br>
	<label for=name>Airline Name :-</label> <input type="name" name=name id=name /><br><br>
	<input type=submit value=submit /> <input type=reset />
</form>
</div>
</center>
</body>
</html>