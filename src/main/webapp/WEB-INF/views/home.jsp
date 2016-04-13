<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<form:form commandName="user" action="save" method="post" >
<!--  

-->
<br/>
<form:input path="username" /> <form:errors  path="username"  /> 
<br/>
<form:input path="email" /> <form:errors path="email"  />
<br/>
<input type="submit" name="sub" value="submit" />

</form:form>

</body>
</html>
