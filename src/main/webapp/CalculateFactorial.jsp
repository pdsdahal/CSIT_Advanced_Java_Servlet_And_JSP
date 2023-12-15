<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculate Factorial</title>
</head>
<body>

<h2>Inside the Factorial</h2>
 
<%

int num1 = Integer.parseInt(request.getParameter("number1").toString());

int result = 1;
for(int i=1;i<=num1;i++){
	result = result * i;
}

%>

<%= "Factorial of "+num1 + " = "+ result %>



</body>
</html>