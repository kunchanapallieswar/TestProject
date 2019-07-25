<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hello Spring
<br><br>

<img src="${pageContext.request.contextPath}/resources/images/abdul.jpg"/>
The message is: ${message}
</body>
</html>