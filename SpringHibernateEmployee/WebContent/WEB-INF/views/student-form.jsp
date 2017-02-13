<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>School addmission system</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="http://jzaefferer.github.com/jquery-validation/jquery.validate.js"></script>
<style type="text/css">

label.error {float: none;
 color: red;
 padding-left: .5em; 
 vertical-align: top;	
}
p {
	clear: both;
}
.submit{margin-left: 12em;}
td{font-weight: bold; padding-right: 1em;vertical-align: top;}
</style>
<script >
$(document).ready(function(){
	$("#studentForm").validate({
		rules:{
			name:"required",
			course:"required",
			address:"required",
			phoneNo:{
				required:true,
				minlength:10,
				maxlength:16,
				number:true
			}
		},
		message:{
			name:"<br>please specify name",
				course:"<br> please specify course",
					address:"<br>please specify address",
						phoneNo:"<br> please specify correct number"
			
		}
	});
});
</script>
</head>
<body>

<br>
		<hr>
			<a style="padding-left:200px;" href="load-home-page">Home</a>
		<hr>
	<h2 align="center">Student Registration Form</h2><hr>
	<center>
		<form:form id="studentForm" name="studentForm" action="add-update-student" method="POST" commandName="studentForm">
			<br>
			<table cellspacing="5" cellpadding="5" bgcolor="#F0FFC2">

				<tr>				
					<td><form:hidden path="rollNo"/></td>
				</tr>
				<tr>
					<td><b>Student Name</b></td>
					<td><form:input path="name" class="required" style="width: 300px;"/></td>
				</tr>
				
				<tr>
					<td><b>Course</b></td>
					<td>
						<form:select path="course" style="width: 300px;">
							<form:option value="" label="Please Select"/>
							<form:options items="${courseList}" itemLabel="name" itemValue="id"/>
						</form:select>
					</td>
				</tr>		

				<tr>
					<td><b>Address</b></td>
					<td><form:textarea path="address" style="width: 300px;" rows="4"/></td>
				</tr>		
				
				<tr>
					<td><b>Phone Number</b></td>
					<td><form:input path="phoneNo" style="width: 300px;"/></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit" value="Add Record"/></td>
				</tr>

			</table>
			</form:form>	
	</center>
	
</body>
</html>