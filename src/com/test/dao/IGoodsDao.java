package com.test.dao;

import java.util.List;

import com.test.bean.Address;
import com.test.bean.Goods;
import com.test.bean.Proxys;
import com.test.bean.Users;

public interface IGoodsDao {
	/**
	 * 商品搜索 
	 */
	public List<Goods> searchGoods(String cont, Address address);
	
}