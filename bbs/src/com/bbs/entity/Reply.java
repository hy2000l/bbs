package com.bbs.entity;

import java.util.Date;

public class Reply {
	private int replyId;
	private String title;
	private String contents;
	private Date publishTime;
	private int click;
	
	
	private Users user;
	//private int uid;
	private int topicId;
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
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
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	
	
}
