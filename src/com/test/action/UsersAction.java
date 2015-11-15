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
		if(users != null){
			//System.out.println(users.getPhone());
			if(usersService.register(users) == 1){
			return "success";
			}
			else{
				return "fail";
			}
		}
		else{
			//ServletActionContext.getRequest().getSession().setAttribute("username", user.getName());
			ServletActionContext.getRequest().setAttribute("lack", "信息缺失，请重新注册");
			return "lack";
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
