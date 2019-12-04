<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="/guru/userDetails">
		<label>Please enter any allergies.</label>
		<textarea name ="allergies" cols="40" rows="5"></textarea>
		<label>Please enter your current weight.</label> <input type="text"
			name="currentWeight" /> <label>Please enter your weight goal.</label>
		<input type="text" name="weightGoal" /> <label>Please enter
			your height.</label> <input type="text" name="height" /> <select
			name="dietSelection">
			<option value="GLUETENFREE">GLUTEN FREE</option>
			<option value="KETOGENIC">KETOGENIC</option>
			<option value="VEGETARIAN">VEGETARIAN/option>
			<option value="LACTOVEGETARIAN">LACTOVEGETARIAN</option>
			<option value="OVOVEGETARIAN">OVOVEGETARIAN</option>
			<option value="VEGAN">VEGAN</option>
			<option value="PESCETARIAN">PESCETARIAN</option>
			<option value="PALEO">PALEO</option>
			<option value="PRIMAL">PRIMAL</option>
			<option value="WHOLE30">WHOLE30</option>

		</select>
		<input type="submit"/>
	</form>
</body>
</html>