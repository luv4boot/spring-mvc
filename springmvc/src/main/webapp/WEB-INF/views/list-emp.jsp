<%@page import="com.luv4boot.springmvc.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Employees</title>
</head>
<body>
	<%
		List<Employee> employees=(List<Employee>)request.getAttribute("employees");
		
		for(Employee e:employees){
			out.println(e);
			out.print("<br>");
		}
	%>
</body>
</html>