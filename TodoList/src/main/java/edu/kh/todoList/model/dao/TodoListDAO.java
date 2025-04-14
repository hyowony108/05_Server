package edu.kh.todoList.model.dao;

import java.sql.Connection;
import java.util.List;

import edu.kh.todoList.model.dto.Todo;

// 유지보수성과 확장성, 테스트 용이성 때문..
// -> Controller 는 ServiceImpl을 직접 쓰지 않고, Service 인터페이스를 의존하므로.
// 	  나중에 구현체가 바뀌어도 Controller는 영향을 받지 않음
// -> ServiceImpl 대신 NewServiceImpl 을 만들어서 새로운 로직을 적용하고 싶을때
//	  쉽게 교체 가능
public interface TodoListDAO {

	List<Todo> todoListFullView(Connection conn) throws Exception;

	int getCompleteCount(Connection conn) throws Exception;

	int todoAdd(Connection conn, String title, String detail) throws Exception;

	Todo todoDetail(Connection conn, int todoNo) throws Exception;

	int todoComplete(Connection conn, int todoNo)throws Exception;

	int todoDelete(Connection conn, int todoNo)throws Exception;

	int todoUpdate(Connection conn, int todoNo, String title, String detail) throws Exception;

}
