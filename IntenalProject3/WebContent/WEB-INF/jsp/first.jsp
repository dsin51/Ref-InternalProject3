<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First page</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
</head>
<body>
<form:form action="addDetails" method="post">
	<header >Welcome!!	</header>
		

		<div><h3>Personal Information</h3>
			<table>
				<tr>
					<td>Name:</td>
					<td><form:input path="name"/></td>
				</tr>
				<tr>
					<td>Roll No.:</td>
					<td><form:input path="roll"/></td>
				</tr>
				<tr>
					<td>Department:</td>
					<td><form:input path="department"/></td>
				</tr>
				
			</table>
		</div>
		
		<div><h3>Academics</h3>
			<table>
				<tr>
					<td>Subject 1:</td>
					<td><form:input path="subjects.sub1"/></td>
				</tr>
				<tr>
					<td>Subject 2:</td>
					<td><form:input path="subjects.sub2"/></td>
				</tr>
				<tr>
					<td>Subject 3:</td>
					<td><form:input path="subjects.sub3"/></td>
				</tr>
				<%-- <tr>
					<td>Total :</td>
					<td><form:input path="name"/></td>
				</tr> --%>
			</table>
		
		</div>
		
		<div><h3>Academics Events</h3>
			<table>
				<tr>
					<td>Seminar</td>
					<td><form:input path="academicsEvents.seminar"/></td>
				</tr>
				<tr>
					<td>Tec. Connect</td>
					<td><form:input path="academicsEvents.tecConnect"/></td>
				</tr>
				<tr>
					<td>G.D.</td>
					<td><form:input path="academicsEvents.gD"/></td>
				</tr>
				<%-- <tr>
					<td>Total :</td>
					<td><form:input path="name"/></td>
				</tr> --%>
				
			</table>
		
		</div>
		<div><h3>Sports</h3>
			<table>
				<tr>
					<td>Sport 1:</td>
					<td><form:input path="sports.sport1"/></td>
				</tr>
				<tr>
					<td>Sport 2:</td>
					<td><form:input path="sports.sport2"/></td>
				</tr>
				<tr>
					<td>Sport 3:</td>
					<td><form:input path="sports.sport3"/></td>
				</tr>
				<%-- <tr>
					<td>Total :</td>
					<td><form:input path="name"/></td>
				</tr> --%>
			</table>
		</div>
		<div><h3>Cultural Activities</h3>
			<table>
				<tr>
					<td>Activity 1</td>
					<td><form:input path="culturalActivities.act1"/></td>
				</tr>
				<tr>
					<td>Activity 2:</td>
					<td><form:input path="culturalActivities.act2"/></td>
				</tr>
				<tr>
					<td>Activity 3:</td>
					<td><form:input path="culturalActivities.act3"/></td>
				</tr>
				<%-- <tr>
					<td>Total :</td>
					<td><form:input path="name"/></td>
				</tr> --%>
			</table>
		</div>
		<input type="submit" value="Submit" >
</form:form>
</body>
</html>