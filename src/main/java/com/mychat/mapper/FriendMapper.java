/**
 * 
 */
package com.mychat.mapper;

import java.util.ArrayList;

import com.mychat.domain.User;

public interface FriendMapper {

	
	/**
	* @Title: getFriendList
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param userId
	* @param @return    设定文件
	* @return ArrayList<User>    返回类型
	* @throws
	*/
	ArrayList<User> getFriendList(Long userId) throws Exception;

}
