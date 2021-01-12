<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
<form action="/project/user?cmd=login" method="post">
<div class="form-group">
  <label for="usr">Name:</label>
  <input type="text" name="username" class="form-control" id="usr">
</div>
<div class="form-group">
  <label for="pwd">Password:</label>
  <input type="password" name="password" class="form-control" id="pwd">
</div>
<button type="submit" class="btn btn-primary">로그인완료</button>

</form>
</div>
</body>
</html>