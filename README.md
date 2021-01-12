# 서버프로그램 구현 포트폴리오

## User 테이블 만들기

![Screenshot_45](https://user-images.githubusercontent.com/74044226/104277969-32b98980-54eb-11eb-8c13-f825a504916f.png)

User 테이블을 만들었다.


## 회원가입 페이지

![Screenshot_49](https://user-images.githubusercontent.com/74044226/104278248-a22f7900-54eb-11eb-878a-021975ea546d.png)

입력한 username, password, email을 controller로 넘기고 Dao에서 DB에 Insert 한다.

![Screenshot_50](https://user-images.githubusercontent.com/74044226/104278280-afe4fe80-54eb-11eb-96d4-0aba9d9a4bf8.png)

![Screenshot_51](https://user-images.githubusercontent.com/74044226/104278606-34d01800-54ec-11eb-92c9-b7c85b61c71a.png)

회원가입 완료.

## 로그인 페이지

![Screenshot_52](https://user-images.githubusercontent.com/74044226/104278306-bbd0c080-54eb-11eb-9596-02be4d9aee47.png)
로그인 화면

![Screenshot_53](https://user-images.githubusercontent.com/74044226/104278343-ce4afa00-54eb-11eb-8286-82a8df7741f0.png)
로그인이 되었다.

DB에 저장된 user를 Dao에서 Select하여 일치하면 로그인을 한다.

## 삭제 기능

- 유저로 로그인
![Screenshot_53](https://user-images.githubusercontent.com/74044226/104278343-ce4afa00-54eb-11eb-8286-82a8df7741f0.png)
해당 유저만 삭제 가능.

- 관리자로 로그인
![Screenshot_55](https://user-images.githubusercontent.com/74044226/104278445-f8042100-54eb-11eb-9103-d7be10facbef.png)
모든 유저 삭제 가능.

- 삭제 완료
![Screenshot_56](https://user-images.githubusercontent.com/74044226/104278543-1f5aee00-54ec-11eb-8dfe-b6f2ae1a95a3.png)
삭제 버튼을 누르면 해당 유저 삭제.

![Screenshot_57](https://user-images.githubusercontent.com/74044226/104278720-65b04d00-54ec-11eb-8ee1-2e0c50316906.png)


