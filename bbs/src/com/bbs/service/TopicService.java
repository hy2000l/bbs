package com.bbs.service;

import com.bbs.entity.Topic;

public interface TopicService {
	/**
	 *  ���Topic
	 *  ��Ҫ���¶�Ӧ������Ϣ����������+ 1
	 *  ����ӷ֣��û����ּ�100��
	 * @param topic
	 * @return
	 */
	public int addTopic(Topic topic);
}
