<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<title>JSTL sql:query Tag</title>
<meta charset="ISO-8859-1">

</head>

<body>
<div align="right">
<a href="Adminlogout">Admin Logout</a>
</div>
	List of Flights:
	<br>
	<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost/flyaway" user="root" password="@Rams9159513412" />

	<sql:query dataSource="${snapshot}" var="result">
            SELECT * from flights ;
         </sql:query>

	<table border="1" width="100%">
		<tr>
			<th>ID</th>
			<th>Flight Name</th>
			<th>Source</th>
			<th>Date</th>
			<th>price(1 Person)</th>
		</tr>

		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${row.id}" /></td>
				<td><c:out value="${row.name}" /></td>
				<td><c:out value="${row.fromf}" /></td>
				<td><c:out value="${row.tof}" /></td>
				<td><c:out value="${row.price}" /></td>
			</tr>
		</c:forEach>
	</table>
	<br>
  <a href="menu.jsp">Back to Menu </a>
</body>
</html>