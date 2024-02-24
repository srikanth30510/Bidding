<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="loginbar.html" %>
<center><h1>home <%=request.getAttribute("username")%></h1></center>
<h1>Product List</h1>
<%@ page import="java.util.List" %>
    <%@ page import="Model.Data" %>
    
    
    <%
        List<Data> productList = (List<Data>)request.getAttribute("productList");
        if (productList != null) {
            for (Data product : productList) {
    %>
    <div class="product-card">
        <h3><%= product.getName() %></h3>
        <p><strong>Price:</strong> <%= product.getPrice() %></p>
        <p><strong>Company:</strong> <%= product.getCompany()%></p>
    </div>
    <% }} %>

</body>
</html>