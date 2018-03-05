/**
 * 
 */
package com.mychat.mapper;

import java.util.ArrayList;

import com.mychat.domain.Message;
import com.mychat.vo.ChatFriend;
import com.sun.mail.handlers.message_rfc822;

public interface MessageMapper {

	
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


	
	/**
	 * @param loginId 
	* @Title: getMessageNotReadCont
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @return    设定文件
	* @return Long    返回类型
	* @throws
	*/
	Long getMessageNotReadCount(Message message);


	
	/**
	* @Title: updateMessages
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param     设定文件
	* @return void    返回类型
	* @throws
	*/
	void updateMessages(Message message);
	String getMessage(Message message);
}
