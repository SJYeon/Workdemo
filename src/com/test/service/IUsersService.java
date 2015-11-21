package com.test.service;

import java.util.List;

import com.test.bean.Users;
import com.test.dao.IUsersDao;

public interface IUsersService {
	/**
	 * 注册用户
	 */
	public int register(Users users);
	/**
	 * 用户登陆
	 */
	public boolean login(Users users);
	/**
	 * 通过用户id查找用户信息
	 */
	public Users getUsersById(int id);
	/**
	 * 通过用户手机号查找用户信息
	 */
	public Users getInfo(String phone);
	/**
	 * 查找用户的消费联盟
	 */
	public List<Users> getUnionMembers(int userid);
}