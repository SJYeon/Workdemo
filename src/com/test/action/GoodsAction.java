package com.test.action;

import java.util.List;

import javax.annotation.Resource;

import com.test.bean.Address;
import com.test.bean.Goods;
import com.test.service.IGoodsService;

/**
 * 
 * @author SJYeon
 *	商品Action
 */
public class GoodsAction {
	// 搜索内容存储列表
	private List<Goods> searchList;
	// 搜索内容
	private String searchcont;
	
	private int goodsId;
	private Goods goods;
	@Resource(name="goodsser")
	private IGoodsService gser;
	
	private Address address;
	
	
	public String getGoodsDetails(){
		
		goods = gser.getGoodsById(goodsId);
		return "success";
	}
	
	public String searchGoods(){
		searchList = gser.searchGoods(searchcont, address);
		return "success";
	}
		
	public IGoodsService getGser() {
		return gser;
	}

	public void setGser(IGoodsService gser) {
		this.gser = gser;
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Goods> getSearchList() {
		return searchList;
	}
	public void setSearchList(List<Goods> searchList) {
		this.searchList = searchList;
	}
	public String getSearchcont() {
		return searchcont;
	}
	public void setSearchcont(String searchcont) {
		this.searchcont = searchcont;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	
}
