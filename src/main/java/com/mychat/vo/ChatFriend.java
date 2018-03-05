/**
 * 
 */
package com.mychat.vo;

public class ChatFriend {

	private Long count;
	private Long userId;
	private String messageInfo;
	private String userPhoto;
	private String userName;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getMessageInfo() {
		return messageInfo;
	}
	public void setMessageInfo(String messageInfo) {
		this.messageInfo = messageInfo;
	}
	public String getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	
}
