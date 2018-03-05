/**
 * 
 */
package com.mychat.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mychat.domain.Message;
import com.mychat.mapper.MessageMapper;
import com.mychat.mapper.UserMapper;
import com.mychat.service.MessageService;
import com.mychat.vo.ChatFriend;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageMapper messageMapper;
	@Autowired
	private UserMapper userMapper;
	@Override
	public void saveMessage(Message message) {
		// TODO Auto-generated method stub
		messageMapper.saveMessage(message);
	}
	/* (non-Javadoc)
	 * @see com.tc.chat.service.MessageService#getMessages(com.tc.chat.domain.Message)
	 */
	@Override
	public ArrayList<Message> getMessages(Message message) {
		// TODO Auto-generated method stub
		return messageMapper.getMessages(message);
	}
	/* (non-Javadoc)
	 * @see com.tc.chat.service.MessageService#getMessageNotReadCont()
	 */
	@Override
	public ArrayList<ChatFriend> getChatFriends(Long loginId) {
		ArrayList<ChatFriend> chatFriends=userMapper.getChatFriendInfo(loginId);
		for (ChatFriend chatFriend : chatFriends) {
			Message message=new Message();
			message.setMessageReciver(loginId);
			message.setMessageSender(chatFriend.getUserId());
			String messageInfo=messageMapper.getMessage(message);
			Long count=messageMapper.getMessageNotReadCount(message);
			chatFriend.setMessageInfo(messageInfo);
			chatFriend.setCount(count);
		}
		return chatFriends;
		
	}
	/* (non-Javadoc)
	 * @see com.tc.chat.service.MessageService#updateMessages()
	 */
	@Override
	public void updateMessages(Message message) {
		// TODO Auto-generated method stub
		messageMapper.updateMessages(message);
	}

}
