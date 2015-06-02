package com.bbs.entity;

public class Board {
	private int boardId;
	private String boardName;
	private int click;
	private int topicCount;
	
	private Topic newTopic;//板块下的最新主题
	
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public int getTopicCount() {
		return topicCount;
	}
	public void setTopicCount(int topicCount) {
		this.topicCount = topicCount;
	}
	public Topic getNewTopic() {
		return newTopic;
	}
	public void setNewTopic(Topic newTopic) {
		this.newTopic = newTopic;
	}
	
}
