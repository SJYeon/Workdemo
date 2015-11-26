package com.test.dao;

import java.util.List;
import com.test.bean.Users;

public interface IUsersDao {

	public abstract int addUsers(Users user);
	
	public abstract Users getUsersById(int id);
	
	public abstract Users getUsersByPhone(String phone);
	
	public abstract boolean deleteUsersById(int id);
	
	public abstract List<Users> getUnionMembers(int userid);
}