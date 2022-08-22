<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href=HomePage.jsp style="color:black;text-decoration:none ;font-size:35px;font-weight:bold;">FlyAway</a>
<br><br>

<%
	@SuppressWarnings("unchecked")
	HashMap<String,String> user=(HashMap<String,String>)session.getAttribute("user");
	if(user==null){
		response.sendRedirect("UserPage.jsp");
	}
%>
<br>
ENTER DETAIL FOR BOOKING:
<br>
<center>

<div style="border:5px solid black;width:25%;border-radius:20px;padding:20px" align="center">
<form action=BookFlight method=post>
	<label for=id>ID :-</label> <input type=text name=id id=id/><br><br>
	<label for=travellers>Travellers :-</label> <input type=text name=travellers id=travellers/><br><br>
	<input type=submit value=Search /> <input type=reset />
</form>
</div>
</center>
</body>
</html>