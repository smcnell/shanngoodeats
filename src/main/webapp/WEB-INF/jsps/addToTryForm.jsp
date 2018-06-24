<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>

<form action="http://localhost:8080/toTry/">
    Restaurant Name:<br>
    <input type="text" name="restName"><br>
    Type of Restaurant:<br>
    <input type="text" name="restType"><br>
    Price:<br>
    <input type="radio" name="restPrice" value = "cheap"> Cheap
    <input type="radio" name="restPrice" value = "medium"> Medium
    <input type="radio" name="restPrice" value = "expensive"> Expensive

    <br>
    Restaurant Speed:<br>
    <input type="radio" name="restSpeed" value = "slow"> Slow
    <input type="radio" name="restSpeed" value = "medium"> Medium
    <input type="radio" name="restSpeed" value = "fast"> Fast

    <br>
    Tags:<br>
    <input type="checkbox" name="restTag" value = "fancy"> Fancy
    <input type="checkbox" name="restTag" value = "date"> Date
    <input type="checkbox" name="restTag" value = "drinks"> Drinks
    <input type="checkbox" name="restTag" value = "american"> American
    <input type="checkbox" name="restTag" value = "atmosphere"> Atmosphere


    <br>
    <input type="submit" value="Submit">


</form>

</table>


</body>
</html>