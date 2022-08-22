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
<%
	@SuppressWarnings("unchecked")
	List<String[]> flightselect=(List<String[]>)session.getAttribute("flightselect");
	if(flightselect!=null){
%>

<h1> Flight For the Given ID</h1>

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

<center><a href=pay.jsp>Book Now</a> </center>
<%
	}
%>


<%
	}
	else{
%>
<h1>There are no available flights</h1>
<%
	}
%>
</body>
</html>