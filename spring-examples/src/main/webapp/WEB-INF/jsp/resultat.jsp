<%-- 
    Document   : resultat
    Created on : 17.okt.2013, 11:55:01
    Author     : jim-espengundersen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title>Spring MVC Form Handler - Result</title>
</head>
<body>
<h3>Resultater:</h3>
<table>
	<tr>
		<td>
			Navn: ${info.firstName}
		</td>
	</tr>
	<tr>
		<td>
			Mellomnavn: ${info.middleName}
		</td>
	</tr>
	<tr>
		<td>
			Etternavn: ${info.lastName}
		</td>
	</tr>
	<tr>
		<td>
			E-post: ${info.email}
		</td>
	</tr>
	<tr>
		<td>
			Postnummer: ${info.postalCode}
		</td>
	</tr>
	<tr>
		<td>
			Alder: ${info.age}
		</td>
	</tr>
	<tr>
		<td>
			Kjønn: ${info.gender}
		</td>
	</tr>
	<tr>
		<td>
			Hobby: ${info.hobby}
		</td>
	</tr>
	</table>
</body>
</html>