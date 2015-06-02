package com.bbs.dao;

import java.util.List;

import com.bbs.entity.Board;

public interface BoardDao {
	
	List<Board> findAll();
	/**
	 * 实现修改点击率，在原有基础上增加1
	 * @param boardId
	 * @return
	 */
	int updateClick(int boardId);
	/**
	 * 实现修改主题数量，在原有基础上增加1
	 * @param boardId
	 * @return
	 */
	int updateTopicCount(int boardId);
	
}
