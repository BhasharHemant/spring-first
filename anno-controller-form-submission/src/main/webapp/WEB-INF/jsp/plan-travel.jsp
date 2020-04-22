<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/planTravel.htm"
		method="post">
		BusProviderName: 
		<select name="busProviders">
			<option>Select</option>
			<c:forEach items="${busProviders}" var="provider">
				<option value="${provider.busProviderId}">${provider.busProviderName}</option>
			</c:forEach>
		</select><br> 
		Source : <input type="text" name="source"><br>
		Destination : <input type="text" name="destination"><br />
		travel Date : <input type="text" name="travelDate"><br />
		Cost: <input type="text" name="cost"><br /> 
		<input type="submit" value="plan travel">
	</form>
</body>
</html>