/**
 * 
 */
package com.mychat.domain;

public class Friend {

	private Long friendId;
	private Long userId;
	private Long friendUserId;
	private String friendAuthorized;
	public Long getFriendId() {
		return friendId;
	}
	public void setFriendId(Long friendId) {
		this.friendId = friendId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getFriendUserId() {
		return friendUserId;
	}
	public void setFriendUserId(Long friendUserId) {
		this.friendUserId = friendUserId;
	}
	public String getFriendAuthorized() {
		return friendAuthorized;
	}
	public void setFriendAuthorized(String friendAuthorized) {
		this.friendAuthorized = friendAuthorized;
	}
	
}
