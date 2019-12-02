<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href='Testing.css' rel='stylesheet' />
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div class="container-form">
		<form id='form' method='post' action='/create'>
			<div class='form-group'>
				<input type='text', name='username' autocomplete="off" required="required"/>
				<label for='username' class="control-label"> Username: </label>
				<i class="bar"></i>
				<br />
			</div>
			<div class='form-group'>
				<input type='password', name='password' autocomplete="off" required="required"/>
				<label for='password' class="control-label"> Password:</label>
				<i class="bar"></i>
				<br />
			</div>
			<div class="button-container" id="button-container">
				<input type='submit' value='Login' class="button"></input>			
			</div>
		</form>
			<div class="button-container" id="button-container">
				<input type='submit' value='Create Account' class="button" onclick="location.href = 'http://localhost:8080/guru/Create.jsp'"></input>
			</div>
	</div>
</body>
</html>