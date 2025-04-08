package edu.kh.todoList.controller;

import java.io.IOException;

import edu.kh.todoList.model.service.TodoListService;
import edu.kh.todoList.model.service.TodoListServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/todo/delete")
public class DeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			
			TodoListService service = new TodoListServiceImpl();
			
			int todoNo = Integer.parseInt(req.getParameter("todoNo"));
			
			int result = service.todoDelete(todoNo);
			
			HttpSession session = req.getSession();
			
			if(result > 0) {
				session.setAttribute("massage", "삭제가 완료되었습니다");
				resp.sendRedirect("/");
				
				return;
			}
			
			session.setAttribute("massage", "삭제 실패!");
			resp.sendRedirect("/");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
