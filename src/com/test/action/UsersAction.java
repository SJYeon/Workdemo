package com.test.action;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.test.bean.Users;
import com.test.service.IUsersService;

public class UsersAction {
	
	private Users users;
	@Resource(name="usersservice")
	private IUsersService usersService;
	
	public String register(){
		
			//System.out.println(users.getPhone());
			if(usersService.register(users) == 1){
			return "success";
			}
			else{
				return "fail";
			}

	}
	
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public IUsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(IUsersService usersService) {
		this.usersService = usersService;
	}

	
}
