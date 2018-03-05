/**
 * 
 */
package com.mychat.domain;

public class User {

	private Long userId;
	private String userPhone;
	private String userName;
	private String userSex;
	private String userPassword;
	private String userAutoGraph;
	private String userPhoto;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserAutoGraph() {
		return userAutoGraph;
	}
	public void setUserAutoGraph(String userAutoGraph) {
		this.userAutoGraph = userAutoGraph;
	}
	public String getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	
}
