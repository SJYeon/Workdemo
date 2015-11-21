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
	private int id;
	@Resource(name="cginfoser")
	private IConsigneeinfoService cgser;
	@Resource(name="usersservice")
	private IUsersService usersSer;
	/**
	 * 通过用户id查询用户的收货人信息
	 * @return
	 */
	public String getConsigneeinfoByUserid(){
		int userid = (Integer) ServletActionContext.getRequest().getSession().getAttribute("userid");
		cgList = cgser.getConsigneeinfoByUserid(userid);
		return "success";
	}
	/**
	 * 添加收货人信息
	 * @return
	 */
	public String addCginfo(){
		int userid = (Integer) ServletActionContext.getRequest().getSession().getAttribute("userid");
		Users users = usersSer.getUsersById(userid);
		cginfo.setUsers(users);
		boolean result = cgser.addCginfo(cginfo);
		return result?"success":"error";
	}
	/**
	 * 删除收货人信息
	 * @return
	 */
	public String deleteCginfo(){
		
		boolean result = cgser.deleteCginfo(id);
		return result?"success":"error";
	}
	/**
	 * 更新收货人的信息
	 * @return
	 */
	public String updateCginfo(){
		boolean result = cgser.updateCginfo(cginfo);
		return result? "success":"error";
	}
	/**
	 * 通过id查询收货人信息
	 * @return
	 */
	public String getCginfoById(){
		cginfo = cgser.getConsigneeinfoById(id);
		return "success";
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
