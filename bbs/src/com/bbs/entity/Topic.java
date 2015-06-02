package com.bbs.entity;

import java.util.Date;

public class Topic {
	
	private int topicId;
	private String title;
	private String Contents;
	private Date publishTime;
	private int replyCount;
	private int click;  
	
	//private int uid;//外键
	private Users user;//关联属性
	
	private int bordId;//封装外键

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return Contents;
	}

	public void setContents(String contents) {
		Contents = contents;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public int getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}

	public int getClick() {
		return click;
	}

	public void setClick(int click) {
		this.click = click;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public int getBordId() {
		return bordId;
	}

	public void setBordId(int bordId) {
		this.bordId = bordId;
	}
	
	
	
}
