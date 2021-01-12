<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Project</title>
</head>
<body>


<!-- 메인 화면 -->
<%
	RequestDispatcher dis = request.getRequestDispatcher("user?cmd=userlist");
	dis.forward(request, response);
%>

</body>
</html>