<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
Welcome to spring MVC
<br>
<br>

<form action="addAlien" method="post">
Enter your id: <input type=text name=aid> <br><br>
Enter alien name : <input  type=text name=aname><br><br>
<input type="submit" name="add" value="Click">
</form>
<hr>
<form action="getOne" method="get">
Enter your id: <input type=text name=aid> <br><br>
<input type="submit" name="search">

</form>

<hr>
<form action="getAlienByAname" method="get">
Enter your Name: <input type=text name=aname> <br><br>
<input type="submit" name="search">

</form>


</body>
</html>