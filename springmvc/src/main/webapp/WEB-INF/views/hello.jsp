<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<h2>Hello from Spring MVC!</h2>
	<div
		style="float: left; width: 30%; text-align: center; top: 0; position: relative;">
		<%
			Integer id = (Integer) request.getAttribute("id");
			String name = (String) request.getAttribute("name");
			Integer salary = (Integer) request.getAttribute("salary");

			out.println("ID - " + id);
			out.print("<br>");
			out.println("Name - " + name);
			out.print("<br>");
			out.println("Salary - " + salary);
		%>
	</div>

	<div
		style="float: left; width: 30%; text-align: center; top: 0; position: relative;">
		<p>ID :-${id}</p>
		<p>Name :-${name}</p>
		<p>Salary :-${salary}</p>
	</div>
</body>
</html>