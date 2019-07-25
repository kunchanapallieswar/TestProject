<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style><%@include file="/WEB-INF/resources/css/my-test.css"%></style>
 <link rel="stylesheet" type="text/css"  
	  href="${pageContext.request.contextPath}/resources/css/my-test.css"> 
	  <script type="text/javascript">
	  
	  function doSomeWork(){
	 
	
	alert("I am doing somework");
} </script>
<%--     <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>   --%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<img src="${pageContext.request.contextPath}/resources/images/abdul.jpg"/>
<h2>Spring mvc demo-Home Page</h2>
<hr>

<a href="/showForm">HellO world form</a><br>
<a href="student/showForm/">Student form</a>


<br><br> 
 <input type="button" onclick="doSomeWork()" value="Click Me"/> 

</body>
</html>