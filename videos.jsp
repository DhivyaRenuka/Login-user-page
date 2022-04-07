<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>videos</title>
</head>
<body>
    <%
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
    response.setHeader("progma","no-cache"); // old version
	// proxy server
	response.setHeader("Expires","0");
		if (session.getAttribute("uname") == null) {
			response.sendRedirect("login.jsp");
		}
	%>
    https://www.youtube.com/watch?v=ZPs3URGs0KQ <br>
    <form action="logout">
	<input type="submit" name="logout" value="logout"/></form>
</body>
</html>