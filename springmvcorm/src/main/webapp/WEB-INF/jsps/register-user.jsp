<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User registration page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script>
	$(document).ready(function() {
		$("#id").change(function() {
			$.ajax({
				url : 'validateUserId',
				data : {
					id : $("#id").val()
				},
				success : function(responseText) {
					$("#errMsg").text(responseText);
					if (responseText != "") {
						$("#id").focus();
					}
				}
			});
		});
	});
	$(document).ready(function() {
		$("#email").change(function() {
			$.ajax({
				url : 'validateEmail',
				data : {
					id : $("#email").val()
				},
				success : function(responseText) {
					$("#errMsg").text(responseText);
					if (responseText != "") {
						$("#email").focus();
					}
				}
			});
		});
	});
</script>
</head>
<body>
	<div class="container">
		<form action="registerUser" method="post">
			<div class="form-group">
				<label for="id">Id:</label> <input type="text" name="id"
					class="form-control" id="id" placeholder="Enter id"> <span
					id="errMsg"></span>
			</div>
			<div class="form-group">
				<label for="name">Name:</label> <input type="text" name="name"
					class="form-control" id="name" placeholder="Enter your name">

			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="email" name="email"
					class="form-control" id="email" placeholder="Enter your email">
				<span id="errMsg"></span>
			</div>
			<button type="submit" class="btn btn-primary btn-block">register</button>
		</form>

		<div class="row">
			<div class="col-sm-12">${result}</div>
		</div>
	</div>
</body>
</html>