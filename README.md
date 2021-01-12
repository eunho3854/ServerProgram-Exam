# 서버프로그램 구현 포트폴리오

## User 테이블 만들기

```
create table user (
	id int primary key auto_increment,
    username varchar(100) not null unique,
    password varchar(100) not null,
    email varchar(100) not null,
    userRole varchar(20)
);
```
## 회원가입 페이지

```
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
```
입력한 username, password, email을 controller로 넘기고 Dao에서 DB에 Insert 한다.


## 로그인 페이지

```
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
```

DB에 저장된 user를 Dao에서 Select하여 일치하면 로그인을 한다.

