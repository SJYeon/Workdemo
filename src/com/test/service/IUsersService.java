package com.test.service;

import com.test.bean.Users;
import com.test.dao.IUsersDao;

public interface IUsersService {

	public int register(Users users);
	public boolean login(Users users);
	public Users getUsersById(int id);
	public Users getInfo(String phone);
}