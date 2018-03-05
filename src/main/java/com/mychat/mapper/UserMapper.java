/**
 * 
 */
package com.mychat.mapper;

import java.util.ArrayList;
import java.util.List;

import com.mychat.domain.User;
import com.mychat.vo.ChatFriend;

public interface UserMapper {

	
	/**
	* @Title: login
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param user
	* @param @return    设定文件
	* @return User    返回类型
	* @throws
	*/
	public User login(User user) throws Exception;

	
	/**
	* @Title: getUserById
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param userId
	* @param @return    设定文件
	* @return User    返回类型
	* @throws
	*/
	public User getUserById(Long userId) throws Exception;
	ArrayList<ChatFriend> getChatFriendInfo(Long loginId);
}
