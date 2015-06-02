package com.bbs.dao;

import java.util.List;

import com.bbs.entity.Topic;

public interface TopicDao {
	
	List<Topic> findByBoardId(int boardId,int pageNo,int pageSize);
	
	int insert(Topic topic);
	
	int updateClick(int topicId);
	
	int updateReplyCount(int topicId);
}
