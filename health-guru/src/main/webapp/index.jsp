<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href='Testing.css' rel='stylesheet' />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<header>
<div id='login' class='header1'>
<input type='submit' value='Login' onclick="location.href = 'http://localhost:8080/guru/Login.jsp'"></input>
</div>
<div class='header2'>
<input type='submit' value='Workout' onclick="location.href = 'http://localhost:8080/guru/Workout.jsp'"></input>
</div>
<div class='header3'>
<input type='submit' value='Meals' onclick="location.href = 'http://localhost:8080/guru/Meals.jsp'"></input>
</div>
</header>
<body>
<!-- Slideshow container -->
<div class="slideshow-container">

  <!-- Full-width images with number and caption text -->
  <div class="mySlides fade">
    <div class="numbertext">1 / 3</div>
    <img class="picture1" src="./pictures/fitness.jpg" alt="fitness">
  </div>

  <div class="mySlides fade">
    <div class="numbertext">2 / 3</div>
    <img class="picture2" src="./pictures/foods.jpg" >
  </div>

  <div class="mySlides fade">
    <div class="numbertext">3 / 3</div>
    <img class="picture3" src="./pictures/weightLoss.jpg" >
  </div>
</div>

<div class='healthy'>
Health is good
</div>

<div class='healthfoods'>
	<img class='omlette_pic' src="./pictures/omlette.jpg">
	<img class='soup_img' src='./pictures/soup.jpg'>
	<img class='spag_img' src='./pictures/spag.jpg'>
</div>

<br>
<script src='javascript.js'></script>
</body>
</html>