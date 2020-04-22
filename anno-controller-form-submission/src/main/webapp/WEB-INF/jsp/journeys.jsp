<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Journeys</title>
	</head>
	<body>
		<table border="1">
			<tr>
				<th>JourneyId</th>
				<th>Source</th>
				<th>Destination</th>
				<th>Travel Date</th>
				<th>Bus Provider Name</th>
				<th>Bus provider ID</th>
				<th>Book</th>
			</tr>
			<c:forEach items="${journeys}" var="journey">
				<tr>
					<td>${journey.journeyId}</td>
					<td>${journey.source}</td>
					<td>${journey.destination}</td>
					<td><fmt:formatDate value="${journey.travelDate}" pattern="yyyy/dd/mm"/></td>
					<td>${journey.busProviderName}</td>
					<td>${journey.busProviderId}</td>
					<td><a href="${pageContext.request.contextPath}/book-ticket.htm?journeyId=${journey.journeyId}">Book</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>