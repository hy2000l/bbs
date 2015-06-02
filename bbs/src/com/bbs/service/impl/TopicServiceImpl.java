package com.bbs.service.impl;

import com.bbs.dao.BoardDao;
import com.bbs.dao.TopicDao;
import com.bbs.dao.UserDao;
import com.bbs.entity.Topic;
import com.bbs.service.TopicService;

public class TopicServiceImpl implements TopicService {

	private TopicDao topicDao;
	private BoardDao boardDao;
	private UserDao userDao;
	/**
	 *  添加Topic
	 *  需要更新对应版块的信息：帖子数量+ 1
	 *  酌情加分：用户积分加100分
	 * @param topic
	 * @return
	 */
	@Override
	public int addTopic(Topic topic) {
		// TODO Auto-generated method stub
		int ret=0;
		ret=topicDao.insert(topic);
		if(ret==1){
			boardDao.updateTopicCount(topic.getBordId());
			boardDao.updateClick(topic.getBordId());
			userDao.updatePoint(topic.getUser().getUserId(), 100);
		}
		return ret;
	}

}
