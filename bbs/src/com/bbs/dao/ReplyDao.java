package com.bbs.dao;

import java.util.List;

import com.bbs.entity.Reply;

public interface ReplyDao {
	
	List<Reply> findByTopicId(int topicId);
	
	int insert(Reply reply);
}
