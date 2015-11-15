package com.test.action;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.test.bean.Users;
import com.test.service.IUsersService;
/**
 * 
 * @author Fu
 *Users表相关操作的Action
 *
 */
public class UsersAction {
	
	private Users users;
	@Resource(name="usersservice")
	private IUsersService usersService;
	/**
	 * 用户注册方法
	 * @return success 注册成功; fail 注册失败
	 */
	public String register(){
	
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
