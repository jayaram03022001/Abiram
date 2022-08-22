<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>
</head>
<body >
<%
	@SuppressWarnings("unchecked")
	List<String[]> flightselect=(List<String[]>)session.getAttribute("flightselect");
	if(flightselect!=null){
%>
<br>
<div style="text-align:right">
<a  href="Logout">Logout</a>
</div>
<div style="text-align:left">
<a  href="Homepage.jsp">Search Flight</a>
</div>
<br><br>
<h1> Flight Details</h1>

<center>
<table border="1">
<tr>
<th>ID</th>
	<th>Name</th>
	<th>Time</th>
	<th>No of Person</th>
	<th>Price</th>
</tr>



<%
	for(String[] flight:flightselect){
%>

<tr>
<td><%=flight[0]%></td>
<td><%=flight[1]%></td>
<td><%=flight[2]%></td>
<td><%=flight[3]%></td>
<td><%=flight[4]%></td>
</tr>
</table>
</center>
<%
	}
%>
<%
	}
%>
<p align="center"  style="color:green;font-size:40px;font-weight:bold">Flight Booked Successfully</p>
<br>

</body>
</html>