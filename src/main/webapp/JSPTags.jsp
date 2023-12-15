<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Tags</title>
</head>
<body>

	<h2>JSP Tags</h2>


	<p>1. JSP Comments Tags</p>

	<%-- 

This is comment body

 --%>

	<p>2. JSP Scriptlet Tag</p>

	<%

for(int i =0;i<10;i++){
	out.println("Texas International Collge<br>");
}

%>

	<p>3. JSP Declaration Tag</p>

	<%!
 public String collegeDetails(int collegeId, String collegePhoneNo, String collegeAddress){
	 return "College Id : "+collegeId+"<br>College PhoneNo : "+collegePhoneNo + "<br>College Address : "+collegeAddress;
 }
 
 %>

	<p>4. Expression Tag</p>
	<%= collegeDetails(123, "2345678", "Baneshwor Nepal") %>

	<p>Finding Factorial using JSP</p>

	<form action="CalculateFactorial.jsp" method="post">
		<label>Number : </label> 
		<input type="number" name="number1"> <br><br> 
		
		<input type="submit" value="Find Factorial">

	</form>

</body>
</html>