<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Admin Home</title>
</head>
<body>
<%@ include file="adminnavbar.html" %>
    <center><h2>Welcome, Admin!</h2>
    <p>What would you like to do?</p>
    </center>
    <center>
    <form action="manageusers.jsp" method="get">
       <input type="submit" value="Manage Users" size=30 >
       </form>
    <br>
    <form action="additem.jsp" method="get">
       <input type="submit" value="Add Item"  size=30>
       </form>
       <br>
       <form action="" method="get">
       <input type="submit" value="Delete Item" size=30>
       </form>
       <br>

    </center>
</body>
</html>