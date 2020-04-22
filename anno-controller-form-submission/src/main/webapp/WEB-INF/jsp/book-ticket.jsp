<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<form:form modelAttribute="ticketForm">
			<form:errors path="*" />
			
			Source: <form:input path="source" readonly="true"/><br>
			Destination : <form:input path="destination" readonly="true"/><br>
			Travel Date : <form:input path="travelDate" readonly="true"/><br>
			Bus provider name :<form:input path="busProviderName" readonly="true"/><br>
			Price : <form:input path="cost" readonly="true"/><br>
			Personal Details:<br>
			Passenger Name : <form:input path="passengerName"/><br>
			Age : <form:input path="age"/><br>
			Gender: Male <form:radiobutton path="gender" value="male"/> (or) Female <form:radiobutton path="gender" value="female"/><br>
			ContactNo:<form:input path="contactNo"/><br>
			Email Address : <form:input path="emailId"/><br>
			<input type="submit" value="book ticket">
						
			
		</form:form>
	</body>
</html>