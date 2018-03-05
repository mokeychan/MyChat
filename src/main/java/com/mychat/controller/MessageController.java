/**
 * 
 */
package com.mychat.controller;

import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.mychat.domain.Message;
import com.mychat.domain.User;
import com.mychat.service.MessageService;
import com.mychat.service.UserService;
import com.mychat.vo.ChatFriend;
import com.mychat.websocket.WebSocketUtils;

@Controller
public class MessageController {

	@Autowired
	private MessageService messageService;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/sendMessage")
	public void sendMessage(Message message,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
	
		message.setMessageRead(0+"");
		messageService.saveMessage(message);
		if(WebSocketUtils.hasConnection(message.getMessageReciver()+"")){
			Gson gson=new Gson();
			WebSocketUtils.get(message.getMessageReciver()+"").getBasicRemote().sendText(gson.toJson(message));
		}

	}
	@RequestMapping("/messages")
	public String getMessages(Message message,Model model) throws Exception{
		User senderUser=userService.getUserById(message.getMessageSender());
		User reciverUser=userService.getUserById(message.getMessageReciver());
		ArrayList<Message> messages=messageService.getMessages(message);
		model.addAttribute("messages", messages);
		model.addAttribute("senderUser",senderUser);
		model.addAttribute("reciverUser",reciverUser);
		return "chat";
	}
	@RequestMapping("/updateMessage")
	public @ResponseBody void updateMessages(Message message){
		messageService.updateMessages(message);
	}
	/*@RequestMapping("/getChatInfo")
	public @ResponseBody ArrayList<ChatFriend> getChatInfo(Long loginId){
		System.out.println(loginId);
		ArrayList<ChatFriend> chatFriends=messageService.getChatFriends(list, loginId);
		return chatFriends;
	}*/
}
