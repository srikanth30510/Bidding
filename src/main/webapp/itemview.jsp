<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="Model.*,java.util.*" %>
<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Type</th>
			<th>Price</th>
			<th>Company Name</th>
			
			
		</tr>
		<% 
		@SuppressWarnings("unchecked")
		List<Data> LD = (List<Data>)request.getAttribute("res2");
		for(Data B:LD)
		{%>
		<tr>
		<td><%=B.getId() %></td>
		<td><%=B.getName() %></td>
		<td><%=B.getType() %></td>
		<td><%=B.getPrice() %></td>
		<td><%=B.getCompany() %></td>
		</tr>
		<%}%>
		</table>
 
	    
</body>
</html>