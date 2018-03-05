/**
 * 
 */
package com.mychat.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.mychat.domain.Message;
import com.mychat.domain.User;
import com.mychat.service.FriendService;
import com.mychat.service.MessageService;
import com.mychat.service.UserService;
import com.mychat.vo.ChatFriend;
import com.mychat.websocket.WebSocketUtils;

@Controller
public class FriendController {

	@Autowired
	private FriendService friendService;
	@Autowired
	private UserService userService;
	@Autowired
	private MessageService messageService;
	@RequestMapping("/list")
	public String friendList(Long userId,Model model,HttpServletRequest request) throws Exception{
		User user=userService.getUserById(userId);
		ArrayList<User> friendList=friendService.getFriendList(userId);
		
		ArrayList<ChatFriend> chatFriends=messageService.getChatFriends(userId);
		model.addAttribute("friendList", friendList);
		model.addAttribute("chatFriends", chatFriends);
		model.addAttribute("user",user);
		return "main";
	}
	@RequestMapping("/online")
	public @ResponseBody void getOnline(Long loginId) throws Exception{
		ArrayList<User> users=friendService.getFriendList(loginId);
		for (User user : users) {
			if(WebSocketUtils.hasConnection(user.getUserId()+"")){
				Message message=new Message();
				message.setMessageType("2");
				message.setMessageInfo(user.getUserId()+"");
				Gson gson=new Gson();
				WebSocketUtils.get(loginId+"").getBasicRemote().sendText(gson.toJson(message));
			}
		}
	}
	@RequestMapping("/noticeFriends")
	public @ResponseBody void noticeFriends(Long loginId) throws Exception{
		ArrayList<User> users=friendService.getFriendList(loginId);
		for (User user : users) {
			if(WebSocketUtils.hasConnection(user.getUserId()+"")){
				Message message=new Message();
				message.setMessageType("2");
				message.setMessageInfo(loginId+"");
				Gson gson=new Gson();
				WebSocketUtils.get(user.getUserId()+"").getBasicRemote().sendText(gson.toJson(message));
			}
		}
	}
	@RequestMapping("/outline")
	public @ResponseBody void noticeFriendsOutLine(Long loginId) throws Exception{
		System.out.println(WebSocketUtils.clients.size());
		System.out.println("22退出id"+loginId);
		ArrayList<User> users=friendService.getFriendList(loginId);
		for (User user : users) {
			if(WebSocketUtils.hasConnection(user.getUserId()+"")){
				Message message=new Message();
				message.setMessageType("3");
				message.setMessageInfo(loginId+"");
				Gson gson=new Gson();
				WebSocketUtils.get(user.getUserId()+"").getBasicRemote().sendText(gson.toJson(message));
			}
		}
	}
}
