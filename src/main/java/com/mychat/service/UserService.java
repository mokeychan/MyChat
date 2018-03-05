/**
 * 
 */
package com.mychat.service;

import com.mychat.domain.User;

public interface UserService {

	
	/**
	* @Title: login
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param userPhone
	* @param @param userPassword
	* @param @return    设定文件
	* @return User    返回类型
	* @throws
	*/
	User login(String userPhone, String userPassword) throws Exception;

	
	/**
	* @Title: getUserById
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param userId
	* @param @return    设定文件
	* @return User    返回类型
	* @throws
	*/
	User getUserById(Long userId) throws Exception;

}
