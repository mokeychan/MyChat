/**
 * 
 */
package com.mychat.service.Impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mychat.domain.User;
import com.mychat.mapper.FriendMapper;
import com.mychat.service.FriendService;

@Service
public class FriendServiceImpl implements FriendService {

	@Autowired
	private FriendMapper friendMapper;
	@Override
	public ArrayList<User> getFriendList(Long userId) throws Exception {
		// TODO Auto-generated method stub
		return friendMapper.getFriendList(userId);
	}

}
