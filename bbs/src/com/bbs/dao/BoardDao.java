package com.bbs.dao;

import java.util.List;

import com.bbs.entity.Board;

public interface BoardDao {
	
	List<Board> findAll();
	/**
	 * ʵ���޸ĵ���ʣ���ԭ�л���������1
	 * @param boardId
	 * @return
	 */
	int updateClick(int boardId);
	/**
	 * ʵ���޸�������������ԭ�л���������1
	 * @param boardId
	 * @return
	 */
	int updateTopicCount(int boardId);
	
}
