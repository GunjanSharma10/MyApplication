<%@page
	import="ch.qos.logback.core.recovery.ResilientSyslogOutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page import="com.gunjan.model.Parts"%>
<%@ page import="java.util.List"%>

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
		<h5>PARTS LIST</h5>
	</div>

	<form action="selected" method="post">
		<div class="upper-btn-box">
			<div class="left-box">
				<button type="submit" id="nextPage">Next</button>
			</div>
			<div class="right-box">
				<input type="text" id="number" placeholder="Enter part id">
				<button type="button" onclick="convert(event)">Search</button>
			</div>
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
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="tempParts" items="${parts}" varStatus="loop">
						<tr>
					<!--  	<c:out value="${loop.index}"  />  -->	
							<td><c:out value="${tempParts.sNo}" />
							<td><c:out value="${tempParts.part_id}" />
							<td><c:out value="${tempParts.part_desc}" />
							<td><c:out value="${tempParts.availability}" />
						  	<td><input type="checkbox" class="check-tab1" id="${loop.index}"
								name="checks" value="${loop.index}" >   
								
								
					<!--  		<td> <input type="checkbox"/ class="check-tab1" id="${loop.index}" name="checks"> -->	
								
															
							<!-- 		<c:set var ="ind"  value = "${loop.index}" scope="session"/>
							 	<c:if test="${checkbox.checked}">								
								<input type ="text" value ="${loop.index}" name ="index"/>
								</c:if>  -->
								
							<td><button class="fa fa-trash"></button>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>

	</form>
 
</body>
</html>