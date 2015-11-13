package com.test.action;

import javax.annotation.Resource;

import com.test.bean.User;
import com.test.service.IUsersService;

public class UsersAction {
	
	private User user;
	@Resource(name="usersservice")
	private IUsersService usersservice;
	
	public String Register(){
		System.out.println(user.getName());
		usersservice.register(user);
		return "success";
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public IUsersService getUsersservice() {
		return usersservice;
	}
	public void setUsersservice(IUsersService usersservice) {
		this.usersservice = usersservice;
	}
}
