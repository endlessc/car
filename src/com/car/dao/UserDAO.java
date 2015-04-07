package com.car.dao;

import java.util.List;

import com.car.model.User;

public class UserDAO {
	
	/**
	 * 添加用户
	 * @param user
	 */
	public void saveUser(User user){
		
	}
	/**
	 * 更新用户
	 * @param user
	 */
	public void updateUser(User user){}
	
	/**
	 * 用户是否存在
	 * @param user
	 * @return
	 */
	public boolean exitUser(User user){
		
		return true;
	}
	
	/**
	 * 删除用户
	 * @param user
	 * @return
	 */
	public boolean deleteUser(User user){
		return true;
	}
	
	/**
	 * 遍历用户
	 * @return
	 */
	public List<User> queryUser(){
		
		return null;
	}
	
	
}
