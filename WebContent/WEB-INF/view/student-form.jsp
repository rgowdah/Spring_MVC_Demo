<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName" />
		<br>
		<br>
		Last Name: <form:input path="lastName" />
		<br>
		<br>		
		Country: <form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br><br>
		Favorite Language:
		C<form:radiobutton path="favoriteLanguage" value="C"/>
		Java<form:radiobutton path="favoriteLanguage" value="Java"/>
		Python<form:radiobutton path="favoriteLanguage" value="Python"/>
		R<form:radiobutton path="favoriteLanguage" value="R"/>
		<br><br>
		Operating Systems:
		Linux<form:checkbox path="operatingSystem" value="Linux"/>
		Windows<form:checkbox path="operatingSystem" value="Windows"/>
		MAC OS<form:checkbox path="operatingSystem" value="MAC OS"/>
		<br><br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>