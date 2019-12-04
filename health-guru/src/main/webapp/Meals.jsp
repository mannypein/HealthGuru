<%@ page import="controllers.MealGenerator" %>
<%@ page import="models.User" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="Testing.css" type="style/css" rel='stylesheet'/>
<script type="text/javascript">
<% MealGenerator mg = new MealGenerator();%>
	<%String s = mg.generateMeals((User)session.getAttribute("user"),null,0);%>;
var link = "<%=s%>";

var idContainer = [null];
fetch(link)
	.then(response => response.json())
	.then(promise_data => {
		console.log(promise_data);
		console.log(promise_data.results.length);
		for(var i = 0; i < promise_data.results.length;i++){
			idContainer[i] = promise_data.results[i].id;
			console.log(idContainer[i]);
		}
		for(var i = 0; i < idContainer.length;i++){
			link = "https://api.spoonacular.com/recipes/" +idContainer[i]+ "/information&apiKey=83ba08bd7814422383e8ba71074270ee";
			fetch(link)
				.then(response => response.json())
				.then(promise_data => {
					console.log(promise_data);
				});
			console.log(link);
		}
	});
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<header>
<div clas='login' class='header1'>
<label onclick="location.href = 'http://localhost:8080/guru/Login.jsp'">Login</label>
</div>
<div class='header2'>
<label onclick="location.href = 'http://localhost:8080/guru/Workout.jsp'">Workout</label>
</div>
<div class='header3'>
<label onclick="location.href = 'http://localhost:8080/guru/Meals.jsp'">Meals Generator</label>
</div>
</header>
<h1 class='pagename'>Meals</h1>
<body>
	<div>
		<div class='sunday'>Sunday</div>
		<div class='Monday'>Monday</div>
		<div class='Tuesday'>Tuesday</div>
		<div class='Wednesday'>Wednesday</div>
		<div class='Thursday'>Thursday</div>
		<div class='Friday'>Friday</div>
		<div class='Saturday'>Saturday</div>
	</div>
</body>
</html>