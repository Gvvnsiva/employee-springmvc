<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="org.dxc.employee.model.Employee,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Employee Details</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>Employee id</td>
				<td>Employee  Name</td>
				<td>Employee salary</td>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty listOfEmployees}">
				<c:forEach var="employee" items="${listOfEmployees}">
					<tr>
						<td>${employee.id}</td>
						<td>${employee.empname}</td>
						<td>${employee.salary}</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</body>
</html>