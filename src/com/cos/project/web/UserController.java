package com.cos.project.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.project.domain.user.User;
import com.cos.project.domain.user.dto.DeleteReqDto;
import com.cos.project.domain.user.dto.DeleteRespDto;
import com.cos.project.domain.user.dto.JoinReqDto;
import com.cos.project.domain.user.dto.LoginReqDto;
import com.cos.project.service.UserService;
import com.google.gson.Gson;

@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmd = request.getParameter("cmd");

		UserService userService = new UserService();

		if (cmd.equals("loginForm")) {
			RequestDispatcher dis = request.getRequestDispatcher("user/loginForm.jsp");
			dis.forward(request, response);
		} else if (cmd.equals("login")) {

			String username = request.getParameter("username");
			String password = request.getParameter("password");
			LoginReqDto dto = new LoginReqDto();
			dto.setUsername(username);
			dto.setPassword(password);
			
			User userEntity = userService.로그인하기(dto);
			if (userEntity != null) {
				HttpSession session = request.getSession();
				session.setAttribute("principal", userEntity);
				System.out.println("로그인성공");
				response.sendRedirect("index.jsp");
			} else {
				System.out.println("로그인 실패");
				response.sendRedirect("index.jsp");
			}
		} else if (cmd.equals("joinForm")) {
			RequestDispatcher dis = request.getRequestDispatcher("user/joinForm.jsp");
			dis.forward(request, response);
		} else if (cmd.equals("join")) {

			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			JoinReqDto dto = new JoinReqDto();
			dto.setUsername(username);
			dto.setPassword(password);
			dto.setEmail(email);
			System.out.println("회원가입 됨? : " + dto);
			int result = userService.회원가입하기(dto);
			
			if (result == 1) {
				response.sendRedirect("index.jsp");
			} else {
				response.sendRedirect("index.jsp");
			}
		} else if(cmd.equals("userlist")) {
			
			List<User> users = userService.유저목록보기();
			request.setAttribute("users", users);
			
			RequestDispatcher dis = request.getRequestDispatcher("user/userlist.jsp");
			dis.forward(request, response);
		} else if(cmd.equals("delete")) {
			
			BufferedReader br = request.getReader();
			String data = br.readLine();
			
			Gson gson = new Gson();
			System.out.println("data : " + data);
			DeleteReqDto dto = gson.fromJson(data, DeleteReqDto.class);
			
			int result = userService.글삭제하기(dto.getId());
			
			DeleteRespDto respDto = new DeleteRespDto(); 
			if(result == 1) {
				respDto.setStatus("ok");
			}
			else {
				respDto.setStatus("fail");
			}
			String respData = gson.toJson(respDto);
			PrintWriter out = response.getWriter();
			out.print(respData);
			out.flush();
		} else if (cmd.equals("logout")) {
			HttpSession session = request.getSession();
			session.invalidate();
			response.sendRedirect("index.jsp");
		}
	}
}
