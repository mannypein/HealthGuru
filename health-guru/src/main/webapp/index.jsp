<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href='index.css' rel='stylesheet' type='text/css'/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<header>
<div id='login' class='header1'>
<label onclick="location.href = 'http://localhost:8080/guru/Login.jsp'">Login</label>
</div>
<div class='header2'>
<label onclick="location.href = 'http://localhost:8080/guru/Workout.jsp'">Workout</label>
</div>
<div class='header3'>
<label onclick="location.href = 'http://localhost:8080/guru/Meals.jsp'">Meals Generator</label>
</div>
</header>
<body>
<!-- Slideshow container -->
<div class="slideshow-container">

  <!-- Full-width images with number and caption text -->
  <div class="mySlides fade">
    <img class="picture1" src="./pictures/fitness.jpg" alt="fitness">
  </div>

  <div class="mySlides fade">
    <img class="picture2" src="./pictures/foods.jpg" >
  </div>

  <div class="mySlides fade">
    <img class="picture3" src="./pictures/weightLoss.jpg" >
  </div>
</div>

<div class='healthy'>
<h3>Health is good</h3>
</div>

<div class='healthfoods'>
	<img class='soup_img' src='./pictures/soup.jpg'>
	<img class='omlette_pic' src="./pictures/omlette.jpg">
	<img class='spag_img' src='./pictures/spag.jpg'>
</div>

<div class='picturebackground'>
	<div class='picturediv'>
		<img class='Healtyperson' src='./pictures/Healthypersonjpg.jpg'>
		<img class='workoutspicture' src='./pictures/workoutss.jpg'>
	</div>
	<div>
		<label class='healthyquote'>"Eat well - Live well"</label>
		<label class='workout1'>"It won't be easy</label>
		<label class='workout2'>but it'll be worth it"</label>
	</div>
</div>
<footer>
  <p>Contact Us Here</p>
  <p>Contact information: <a href="mailto:someone@example.com">
  someone@example.com</a>.</p>
</footer>
<br>
<script src='javascript.js'></script>
</body>
</html>