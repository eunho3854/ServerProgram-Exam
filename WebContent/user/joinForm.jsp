<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form action="/project/user?cmd=join" method="post">

<div class="form-group">
  <label for="usr">Name:</label>
  <input type="text" name="username" class="form-control" id="user">
</div>
<div class="form-group">
  <label for="pwd">Password:</label>
  <input type="password" name="password" class="form-control" id="password">
</div>
<div class="form-group">
  <label for="email">email:</label>
  <input type="text" name="email" class="form-control" id="email">
</div>
<button type="submit" class="btn btn-primary">회원가입완료</button>
</form>
</div>
</body>
</html>