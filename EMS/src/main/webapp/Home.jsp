<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Home Page</h1>
<h3>Welcome: <%= request.getAttribute("name") %></h3>
<table border="1" cellspacing="5" cellpadding="5">
	        	<tr>
		        	<th>No</th>
		        	<th>Name</th>
		        	<th>Email</th>
		        	<th>Address</th>
		        	<th>Telephone</th>
		        	<th>Profile</th>
		        	<th>Salary</th>
		        	<th> Action</th>
		        	
	        	</tr>
				<c:forEach var="employee" items="${employeeList}">
		        	<tr>
		        		<td>${employee.id}</td>
						<td>${employee.name}</td>
						<td>${employee.email}</td>
						<td>${employee.address}</td>
						<td>${employee.telephone}</td>
						<td>${employee.salary}</td>
						<td>${employee.action}</td>
						<td>
							<a href="employee?id=${employee.id}">Edit</a>
							<a href="delete?id=${employee.id}">Delete</a>
						</td>
		        	</tr>
				</c:forEach>	        	
			</table>

<input type="button" onClick="location.href='index.jsp'"
value='Log Out'>

</body>
</html>