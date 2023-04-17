<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Form</h1>

<h3 style="color:red;">Registration Issue, Kindly Register Again.</h3>
<h5 style="color:red;"> <%= request.getAttribute("result1") %></h6>

<form action="register">

<label><b>Full Name:
       </b>
       </label>
       <input type="text" name="name" placeholder="Enter your Name"><br><br>
<label><b>Branch:
       </b>
       </label>
       <input type="text" name="branch" placeholder="Enter your Branch"><br><br>
<label><b>Contact:
       </b>
       </label>
       <input type="text" name="contact" placeholder="Enter your Contact"><br><br>
<label><b>Email:
       </b>
       </label>
       <input type="text" name="email" placeholder="Enter your Email"><br><br>
<label><b>User Name:
       </b>
       </label>
       <input type="text" name="userName" placeholder="Enter your userName"><br><br>
<label><b>Password:
       </b>
       </label>
       <input type="text" name="passWord" placeholder="Enter your Password"><br><br>
<input type="submit" value="Register">
</form>

</body>
</html>