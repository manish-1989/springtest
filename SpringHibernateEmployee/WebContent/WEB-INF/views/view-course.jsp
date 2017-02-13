<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>
<%@ page import="java.sql.Timestamp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
		String date = "";
	%>
	<%
		 Format formatter = new SimpleDateFormat("E dd MMM yyyy");
	%>
	<br>
	<hr>
		<a style="padding-left:200px;" href="load-home-page">Home</a>
	<hr>
	<h2 align="center">Cources Offered by University</h2><hr>
	<center>
			<br>
				<table cellspacing="5" cellpadding="5" bgcolor="#F0FFC2" width="650">
				<tr>
					<td><b>Code</b></td>
					<td><b>Title</b></td>
					<td><b>Fee</b></td>
					<td><b>Duration</b></td>
					<td><b>Addmission Opens on</b></td>
			     <tr>
				
				<c:forEach var="course" items="${courseList}">
					<tr>
						<td>${course.id}</td>
						<td><a style="text-decoration: none; color: black;" href="admin/load-student-form?courseId=${course.id}">${course.name}</a></td>
						<td>${course.fee}</td>
						<td>${course.duration}</td>
						<td><c:set scope="session" var="date" value="${course.admissionOpenOn}" />
							<%
								Timestamp time = (Timestamp) session.getAttribute("date");
								String s = new SimpleDateFormat("E dd MMM yyyy").format(time);
								out.print(s);
							%>
						</td>
					</tr>
				</c:forEach>			
				</table>
	</center>
</body>
</html>