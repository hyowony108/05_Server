package edu.kh.todoList.model.service;

import java.util.Map;

public interface TodoListService {

	/** 할 일 목록 반환 서비스
	 * @return todoList + 완료개수 map
	 */
	Map<String, Object> todoListFullView();

}
