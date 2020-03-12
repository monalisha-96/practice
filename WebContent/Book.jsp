<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Book</h1>
<form action="Controller" method="post">
Book name:<input type="text" name="name"><br/><br/>
Author Name:<input type="text" name="author"><br/><br/>
Call Number:<input type="text" name="callno"><br/><br/>
<button name="submit" value="add">Submit</button>
</form>
</body>
</html>