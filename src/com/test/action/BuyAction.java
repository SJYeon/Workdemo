package com.test.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.test.bean.Consigneeinfo;
import com.test.bean.Goods;
import com.test.service.IConsigneeinfoService;
import com.test.service.IGoodsService;

public class BuyAction {
	//直接购买时的 商品id
	private int goodsid;
	// 查询出的商品信息 
	private Goods bngoods;
	//直接够买时的 商品数量
	private int bnsum;
	//查询用户的收货人信息列表
	private List<Consigneeinfo> cglist;
	@Resource(name="cginfoser")
	private IConsigneeinfoService cgser;
	@Resource(name="goodsser")
	private IGoodsService gser;
	/**
	 * 点击直接购买 相应函数
	 * @return
	 */
	public String buyNow(){
		//获取用户id
		int userid = (Integer)ServletActionContext.getRequest().getSession().getAttribute("userid");
		//查询用户收货人信息列表
		cglist = cgser.getConsigneeinfoByUserid(userid);
		//查询购买的商品信息
		
		
		bngoods = gser.getGoodsByIdWithProxy(goodsid);

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
