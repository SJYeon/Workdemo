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
	/**
	 * 根据商品id查询商品的全部信息
	 * 
	 * @param goodsid  商品id
	 * @return 查询后的商品
	 */
	public Goods getGoodsDetails(int goodsid);
}