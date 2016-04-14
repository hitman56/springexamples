<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>


	<form:form method="POST" action="save" 
		enctype="multipart/form-data">
		
		
		
		<input type="file" id="file" name="file" /><br/>
		<input type="text" name="email" />
		<input type="submit" value="upload" />
		
		</form:form>
</body>
</html>
