<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <h2>Personinformasjon</h2>
		<form:form method="POST" modelAttribute="info" action="addPerson">
			<form:errors path="*" />
			<table>
				<tr>
					<td>Fornavn:</td>
					<td><form:input path="firstName"/></td>
					<td><form:errors path="firstName" /></td>
				</tr>
				<tr>
					<td>Mellomnavn:</td>
					<td><form:input path="middleName" /></td>
				</tr>
				<tr>
					<td>Etternavn:</td>
					<td><form:input path="lastName" /></td>
					<td><form:errors path="lastName" /></td>
				</tr>
				<tr>
					<td>E-post:</td>
					<td><form:input path="email" /></td>
					<td><form:errors path="email" /></td>
				</tr>
				<tr>
					<td>Postnummer:</td>
					<td><form:input path="postalCode" /></td>
					<td><form:errors path="postalCode" /></td>
				</tr>
				<tr>
					<td>Alder:</td>
					<td><form:input path="age" /></td>
					<td><form:errors path="age" /></td>
				</tr>
				<tr>
					<td>Kjønn:</td>
					<td><form:select path="gender">
						<form:option value="">Velg kjønn</form:option>
						<form:option value="Mann">Mann</form:option>
						<form:option value="Kvinne">Kvinne</form:option>
					</form:select>
					</td>
				</tr>
				<tr>
					<td>Hobby:</td>
					<td><form:select path="hobby">
						<form:option value="">Velg hobby</form:option>
						<form:option value="Ballsport">Ballsport</form:option>
						<form:option value="Strikking">Strikking</form:option>
						<form:option value="Ridning">Ridning</form:option>
						<form:option value="Data">Data</form:option>
						<form:option value="Musikk">Musikk</form:option>
					</form:select>
					</td>
				</tr>
				<td><input type="submit" value="Send"/></td>
			</table>
		</form:form>
	</body>
</html>