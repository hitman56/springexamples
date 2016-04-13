<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>


<form:form action="save" commandName="user" method="post">

<form:input path="name" />
<br/>
<form:input path="email" />
<br/>
<form:input path="address" />
<br/>
<form:select multiple="true" path="education_form">
   <form:options items="${eduname}" itemValue="id" itemLabel="name"  /> 
</form:select>

<br/>
<input type="submit" name="sub" value="Submit" />


</form:form>


</body>
</html>
