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
