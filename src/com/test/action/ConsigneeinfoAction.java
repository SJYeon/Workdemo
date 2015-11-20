package com.test.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.test.bean.Consigneeinfo;
import com.test.bean.Users;
import com.test.service.IConsigneeinfoService;
import com.test.service.IUsersService;

public class ConsigneeinfoAction {
	private Consigneeinfo cginfo;
	private List<Consigneeinfo> cgList;
	
	@Resource(name="cginfoser")
	private IConsigneeinfoService cgser;
	@Resource(name="usersservice")
	private IUsersService usersSer;

	public String getConsigneeinfoByUserid(){
		int userid = (Integer) ServletActionContext.getRequest().getSession().getAttribute("userid");
		cgList = cgser.getConsigneeinfoByUserid(userid);
		System.out.println(cgList.size());
		return "success";
	}
	public String addCginfo(){
		int userid = (Integer) ServletActionContext.getRequest().getSession().getAttribute("userid");
		Users users = usersSer.getUsersById(userid);
		cginfo.setUsers(users);
		boolean result = cgser.addCginfo(cginfo);
		return result?"success":"error";
	}
	public Consigneeinfo getCginfo() {
		return cginfo;
	}
	public void setCginfo(Consigneeinfo cginfo) {
		this.cginfo = cginfo;
	}
	public List<Consigneeinfo> getCgList() {
		return cgList;
	}
	public void setCgList(List<Consigneeinfo> cgList) {
		this.cgList = cgList;
	}
	
	public IConsigneeinfoService getCgser() {
		return cgser;
	}
	
	public void setCgser(IConsigneeinfoService cgser) {
		this.cgser = cgser;
	}
	
	public IUsersService getUsersSer() {
		return usersSer;
	}
	public void setUsersSer(IUsersService usersSer) {
		this.usersSer = usersSer;
	}
}
