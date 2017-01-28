<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
	<title>User Confirmation Page</title>
</head>

	<body>
	
	    The User is confirmed: ${user.firstName } ${user.lastName}
	    
	    <br><br>
	
	    Country: ${user.country}
	    
	    <br><br>
	
	    Favorite Language: ${user.favoriteLanguage}
	
	<br><br>
	
	    Operating Systems: 
	    <ul>
	          <c:forEach var="temp" items ="${user.operatingSystems}">
	       <li>${temp}</li>
	       </c:forEach>
	    </ul>
	
	
	
	</body>
	
	

</html>