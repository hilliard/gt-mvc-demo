<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
	<title>User Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="user">
		First Name: <form:input path="firstName" />
		<br><br>
		
		Last Name: <form:input path="lastName" />
		<br><br>
		
		Country:
		<%-- <form:select path="country">
			<form:option value="Brazil" label = "Brazil" />
			<form:option value="France" label = "France" />
			<form:option value="Germany" label = "Germany" />
			<form:option value="India" label = "India" />
			<form:option value="Turkey" label = "Turkey" />
		</form:select> --%>
		
		<form:select path="country" >
		    hard coded select list
			<form:options items="${user.countryOptions }" />
			<%-- using countries.properties file
			<form:options items= "${theCountryOptions }" /> --%>
		
		</form:select>
		<br><br>
		
		Favorite Language: 
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
		Go <form:radiobutton path="favoriteLanguage" value="Go" />
					
		<br><br>
		
		Operating Systems: 
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		MacOS <form:checkbox path="operatingSystems" value="MacOS" />
		Windows 10 <form:checkbox path="operatingSystems" value="Windows 10" />
		DOS <form:checkbox path="operatingSystems" value="DOS" />
	
		
		<input type="submit" value="Submit" />
		
	</form:form>



</body>

</html>