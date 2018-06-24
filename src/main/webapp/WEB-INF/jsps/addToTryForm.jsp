<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>

<form:form method="POST" action="http://localhost:8080/addToTry/" modelAttribute="placeToTry">
    Restaurant Name:<br>
    <input type="text" name="restName"><br>
    Type of Restaurant:<br>
    <input type="text" name="restType"><br>
    Price:<br>
    <input type="radio" name="priceEnum" value = "CHEAP"> Cheap
    <input type="radio" name="priceEnum" value = "MEDIUM"> Medium
    <input type="radio" name="priceEnum" value = "EXPENSIVE"> Expensive

    <br>
    Restaurant Speed:<br>
    <input type="radio" name="speedEnum" value = "SLOW"> Slow
    <input type="radio" name="speedEnum" value = "MEDIUM"> Medium
    <input type="radio" name="speedEnum" value = "FAST"> Fast

    <br>
    Tags:<br>
    <input type="checkbox" name="tagEnum" value = "FANCY"> Fancy
    <input type="checkbox" name="tagEnum" value = "DATE"> Date
    <input type="checkbox" name="tagEnum" value = "DRINKS"> Drinks
    <input type="checkbox" name="tagEnum" value = "AMERICAN"> American
    <input type="checkbox" name="tagEnum" value = "ATMOSPHERE"> Atmosphere


    <br>
    <input type="submit" value="Submit">


</form:form>

</table>


</body>
</html>