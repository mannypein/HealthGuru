<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href='Testing.css' rel='stylesheet' />
<meta charset="ISO-8859-1">
<title>Create</title>
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
			<div class='form-group'>
				<input type='password', name='confirmPassword' autocomplete="off" required="required"/> 
				<label for='confirmPassword' class="control-label"> Confirm Password:</label> 
				<i class="bar"></i>
				<br />
			</div>
			<div class='form-group'>
				<input type='text', name='email' autocomplete="off" required="required"/>
				<label for='email' class="control-label"> Email: </label> 
				<i class="bar"></i>
				<br />
			</div>
			<div class="button-container">
				<input type='submit' value='Create' class="button"></input>
			</div>
		</form>
	</div>
</body>
</html>