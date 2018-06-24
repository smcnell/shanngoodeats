<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>

<h1>PLACES TO TRY</h1>
<table style="width:100%">
    <tr>
        <th>Restaurant Name</th>
        <th>Type of Restaurant </th>
        <th>Price</th>
        <th>Speed</th>
        <th>Tags</th>
    </tr>
    <tr>
        <td>Wendys</td>
        <td>Fast Food</td>
        <td>CHEAP</td>
        <td>FAST</td>
        <td>DATE</td>
    </tr>

    <tr>
        <td>Olive Garden</td>
        <td>Italian</td>
        <td>MEDIUM</td>
        <td>SLOW</td>
        <td>DATE</td>
    </tr>

    <tr>
        <td>${restName}</td>
        <td>${restType}</td>
        <td>${priceEnum}</td>
        <td>${speedEnum}</td>
        <td>${tagEnum}</td>
    </tr>

    <a href="http://localhost:8080/toTry/addToTry">
        <input type="button" value="Add a Place I Want to Try" />
    </a>

</table>


</body>
</html>
