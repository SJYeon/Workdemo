package com.test.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.test.bean.Consigneeinfo;
import com.test.service.IConsigneeinfoService;

public class ConsigneeinfoAction {
	private Consigneeinfo cginfo;
	private List<Consigneeinfo> cgList;
	private IConsigneeinfoService cgser;
	
	public String getConsigneeinfoByUserid(){
		int userid = (Integer) ServletActionContext.getRequest().getSession().getAttribute("userid");
		cgList = cgser.getConsigneeinfoByUserid(userid);
		return "success";
	}
	public String addCginfo(){
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
}
