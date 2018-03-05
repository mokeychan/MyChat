/**
 * 
 */
package com.mychat.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mychat.domain.User;
import com.mychat.mapper.UserMapper;
import com.mychat.service.UserService;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public User login(String userPhone, String userPassword) throws Exception {
		User user=new User();
		user.setUserPhone(userPhone);
		user.setUserPassword(userPassword);
		return userMapper.login(user);
	}
	/* (non-Javadoc)
	 * @see com.tc.chat.service.UserService#getUserById(java.lang.Long)
	 */
	@Override
	public User getUserById(Long userId) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getUserById(userId);
	}

}
