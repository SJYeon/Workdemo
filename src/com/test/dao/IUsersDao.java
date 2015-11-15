package com.test.dao;

import com.test.bean.Users;

public interface IUsersDao {

	public abstract int addUsers(Users user);
	public abstract int getUsersById(int id);
	public abstract Users getUsersByPhone(String phone);
	public abstract int deleteUsersById(int idr);
}