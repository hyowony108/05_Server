package edu.kh.jsp.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebServlet() 소괄호 안쪽의 문자열 == 매핑될 주소
//주소 미작성시 서버가 안켜짐(오류남)
@WebServlet("/el_jstl")
public class ELJstlServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		1) JSP경로 (webapp 폴더 기준)
		String path = "/WEB-INF/views/el_jstl.jsp";
		
//		2) 요청 발송자 얻어오기
		RequestDispatcher dispathcher = req.getRequestDispatcher(path);
		
//		3) 요청 위임 (forward)
		dispathcher.forward(req, resp);
	}
}
