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
	private String inviterid;

	@Resource(name="usersservice")
	private IUsersService usersService;
	/**
	 * 用户注册方法
	 * @return success 注册成功; fail 注册失败
	 */
	public String register(){
		//查询是否有邀请人 id
		if(inviterid != null && !inviterid.equals("")){
			//查找邀请人
			Users inviter = usersService.getUsersById(Integer.parseInt(inviterid));
			if(inviter == null){
				ServletActionContext.getRequest().setAttribute("failmessage", "信息错误请重新注册！");
				return "fail";
			}
			//将邀请人添加到信息中
			users.setUsers(inviter);
		}
//		return "success";
		//判断是否插入成功
		if(usersService.register(users) == 1){
			//插入成功 则将手机号加入session中
			ServletActionContext.getRequest().getSession().setAttribute("phone", users.getPhone());
			return "success";
		}
		else{
			//如果插入失败 则返回错误信息
			ServletActionContext.getRequest().setAttribute("failmessage", "信息错误请重新注册！");
			return "fail";
		}
		
	}
	public String login(){
		if(usersService.login(users)){
			ServletActionContext.getRequest().getSession().setAttribute("phone", users.getPhone());
			return "success";
		}
		else{
			ServletActionContext.getRequest().setAttribute("loginmessage", "登录错误，请重新登录！");
			return "error";
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

	public String getInviterid() {
		return inviterid;
	}
	public void setInviterid(String inviterid) {
		this.inviterid = inviterid;
	}
	
}
