<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User Details</title>
</head>
<body>
<form:form action="addappuser" method="post" modelAttribute="appuser">
<form:hidden path="id"/>
Enter user name:<form:input path="name"/><br/>
Enter user password:<form:input path="password"/><br/>
Enter user email:<form:input path="email"/><br/>
Enter user phone:<form:input path="phone"/><br/>
Enter user address:<form:input path="address"/><br/>
Enter user roles:<form:input path="roles"/><br/>
Enter user active:<form:input path="active"/><br/>
<input type="submit">
</form:form>

</body>
</html>