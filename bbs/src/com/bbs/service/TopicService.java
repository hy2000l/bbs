package com.bbs.service;

import com.bbs.entity.Topic;

public interface TopicService {
	/**
	 *  添加Topic
	 *  需要更新对应版块的信息：帖子数量+ 1
	 *  酌情加分：用户积分加100分
	 * @param topic
	 * @return
	 */
	public int addTopic(Topic topic);
}
