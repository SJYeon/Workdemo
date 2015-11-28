package com.test.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.test.bean.Consigneeinfo;
import com.test.bean.Goods;
import com.test.service.IConsigneeinfoService;
import com.test.service.IGoodsService;

public class BuyAction {
	
	private int goodsid;
	private Goods bngoods;
	private int bnsum;
	private List<Consigneeinfo> cglist;
	@Resource(name="cginfoser")
	private IConsigneeinfoService cgser;
	@Resource(name="goodsser")
	private IGoodsService gser;
	public String buyNow(){
		int userid = (Integer)ServletActionContext.getRequest().getSession().getAttribute("userid");
		cglist = cgser.getConsigneeinfoByUserid(userid);
		bngoods = gser.getGoodsByIdForOrder(goodsid);
		
		return "success";
	}
	public IConsigneeinfoService getCgser() {
		return cgser;
	}
	public void setCgser(IConsigneeinfoService cgser) {
		this.cgser = cgser;
	}
	public List<Consigneeinfo> getCglist() {
		return cglist;
	}
	public void setCglist(List<Consigneeinfo> cglist) {
		this.cglist = cglist;
	}
	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	public Goods getBngoods() {
		return bngoods;
	}
	public void setBngoods(Goods bngoods) {
		this.bngoods = bngoods;
	}
	public int getBnsum() {
		return bnsum;
	}
	public void setBnsum(int bnsum) {
		this.bnsum = bnsum;
	}
	
}
