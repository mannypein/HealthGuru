<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
        <form id='form' method='POST' action='/guru/login'>
            <label for='username'> Username: </label>
                <input type='text' id='username'/>
                <br/>
            <label for='password'> Password:</label>
                <input type='password' id='password'/>
                <br/>
            <input type='submit' value='Login'></input>
            <input type='button' value='Create Account'>
        </form>
    </div>
</body>
</html>