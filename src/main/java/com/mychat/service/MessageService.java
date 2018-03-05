/**
 * 
 */
package com.mychat.service;

import java.util.ArrayList;
import java.util.List;

import com.mychat.domain.Message;
import com.mychat.vo.ChatFriend;

public interface MessageService {

	
	/**
	* @Title: saveMessage
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param message    设定文件
	* @return void    返回类型
	* @throws
	*/
	void saveMessage(Message message);

	
	/**
	* @Title: getMessages
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param message
	* @param @return    设定文件
	* @return ArrayList<Message>    返回类型
	* @throws
	*/
	ArrayList<Message> getMessages(Message message);
	ArrayList<ChatFriend> getChatFriends(Long loginId);
	void updateMessages(Message message);

}
