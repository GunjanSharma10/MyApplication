<%@page import="ch.qos.logback.core.recovery.ResilientSyslogOutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resources/css/index.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
<title>The Training</title>
</head>
<body>

	<div class="header">
		<h5>SELECTED PARTS LIST</h5>
	</div>

	<div class="table-box">
		<table id="table1">
			<thead>
				<tr>
					<th>SNo</th>
					<th>Part ID</th>
					<th>Part Description</th>
					<th>Availability</th>
					<th>Checklist</th>
					
				</tr>
			</thead>
			<tbody>

				<c:forEach var="tempParts" items="${lparts}">
					<tr>

						<td><c:out value="${tempParts.sNo}" />
						<td><c:out value="${tempParts.part_id}" />
						<td><c:out value="${tempParts.part_desc}" />
						<td><c:out value="${tempParts.availability}" />
				
						
				 
										   
						<td><input type="checkbox" name="checks1" class="check-tab1" 
						<c:set var="checkValue" value ="${tempParts.checklist}"  />
						<c:choose> <c:when test="${checkValue == true }"> checked="checked"</c:when>
						<c:otherwise > </c:otherwise> </c:choose>
						
					 
						      />
							
		
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>


</body>
</html>