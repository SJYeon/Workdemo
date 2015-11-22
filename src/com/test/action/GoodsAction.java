package com.test.action;

import java.util.List;

import com.test.bean.Goods;

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
	
	
}
