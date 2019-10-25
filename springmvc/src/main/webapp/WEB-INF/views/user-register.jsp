<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>User Registration Form</h2>
		<form action="registerUser" method="post">
			<div class="form-group">
				<label for="id">Id:</label>
				<input type="text" name="id" class="form-control" id="id" placeholder="Enter Id.........."/>
			</div>
			<div class="form-group">
				<label for="name">Name:</label>
				<input type="text" name="name" class="form-control" id="name" placeholder="Enter Your Name.........."/>
			</div>
			<div class="form-group">
				<label for="email">Email:</label>
				<input type="email" name="email" class="form-control" id="email" placeholder="Enter Id.........."/>
			</div>
			<button type="submit" class="btn btn-info btn-block">register</button>
		</form>
	</div>
</body>
</html>