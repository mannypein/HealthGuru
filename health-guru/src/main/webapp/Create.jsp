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
        <form id='form' method='post' action='/create'>
            <label for='username'> Username: </label>
                <input type='text' name='username'/>
                <br/>
            <label for='password'> Password:</label>
                <input type='password' name='password'/>
                <br/>
            <label for='confirmPassword'> Confirm Password:</label>
                <input type='password' name='confirmPassword'/>
                <br/>
            <label for='email'> Email: </label>
              	<input type='text' name='email'/>
               	<br/>
            <input type='submit' value='Create'></input>
        </form>
    </div>
</body>
</html>