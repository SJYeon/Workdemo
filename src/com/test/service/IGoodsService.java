package com.test.service;

import java.util.List;

import com.test.bean.Address;
import com.test.bean.Goods;
import com.test.bean.Users;

public interface IGoodsService {
	/**
	 * 商品搜索
	 */
	public List<Goods> searchGoods(String cont, Address address);
}