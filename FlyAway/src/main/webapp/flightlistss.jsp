<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%
	String f = request.getParameter("from");
	String t = request.getParameter("to");
	String d = request.getParameter("departure");
	session.setAttribute("fromf", f);
	session.setAttribute("tof", t);
	session.setAttribute("departure", d);
%>
<html>
<head>
<title>JSTL sql:query Tag</title>
</head>

<body>
	Available Flights:
	<br>
	<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost/flyaway" user="root" password="@Rams9159513412" />

	<sql:query dataSource="${snapshot}" var="result">
            SELECT * from flights where fromf='<%=session.getAttribute("fromf")%>'and tof='<%=session.getAttribute("tof")%>'and datef='<%=session.getAttribute("departure")%>';
         </sql:query>

	<table border="1" width="100%">
		<tr>
			<th>ID</th>
			<th>Flight Name</th>
			<th>Departure Date</th>
			<th>Time</th>
			<th>price(1 Person)</th>
		</tr>

		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${row.id}" /></td>
				<td><c:out value="${row.name}" /></td>
				<td><c:out value="${row.datef}" /></td>
				<td><c:out value="${row.timef}" /></td>
				<td><c:out value="${row.price}" /></td>
			</tr>
		</c:forEach>
	</table>
	<br>
<c:choose>
<c:when test="${result.rowCount!=0}">
	Note ID for Booking Flight
      <a href="select.jsp">Book NoW </a>
</c:when>
<c:when test="${result.rowCount==0}">
	Sorry! No Flights Available
</c:when>
<c:otherwise>
	Oops! Something went Wrong
</c:otherwise>
</c:choose>



</body>
</html>