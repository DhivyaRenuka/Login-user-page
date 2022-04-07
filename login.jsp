<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
.container {
	width: 60%;
	border: 5px solid black;
	margin: 190px;;
	padding: 50px;
	font-size: 30px;
	text-align: center;
}

form input {
	font-size: 30px;
}
</style>
</head>
<body>
	<div class="container">
		<form action="login1" method="post">
			Enter user name  : <input type="text" name="uname"></br> </br> 
			Enter password  : <input type="password" name="password" /> <br /></br> 
			 <input type="submit" name="Login" value="Login" />  
			 <input type="reset" name="Clear" value="Clear" />
			 <br>
			<a href="register.jsp"> Click here to register</a>
			 
		</form>
	</div>
</body>
</html>