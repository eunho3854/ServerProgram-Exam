package com.cos.project.service;

import java.util.List;

import com.cos.project.domain.user.User;
import com.cos.project.domain.user.UserDao;
import com.cos.project.domain.user.dto.JoinReqDto;
import com.cos.project.domain.user.dto.LoginReqDto;

public class UserService {
	
	private UserDao userDao; 

	public UserService() {
		userDao = new UserDao();
	}
	
	public int 회원가입하기(JoinReqDto dto) {
		
		int result = userDao.회원가입(dto);
		return result;
	}
	
	public User 로그인하기(LoginReqDto dto) {
		
		System.out.println("로그인 서비스 됨?");
		return userDao.로그인(dto);
	}
	
	public List<User> 유저목록보기() {
		return userDao.유저목록();
	}
	
	public int 글삭제하기(int id) {
		return userDao.삭제(id);
	}
	
}
