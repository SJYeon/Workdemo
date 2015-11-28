package com.test.dao;

import java.util.List;

import com.test.bean.Address;
import com.test.bean.Goods;
import com.test.bean.Proxys;
import com.test.bean.Users;

public interface IGoodsDao {
	/**
	 * 商品搜索
	 * @param cont 搜索内容
	 * @param address 搜索商品的地址
	 * @return 返回查询的列表
	 */
	public List<Goods> searchGoods(String cont, Address address);
	/**
	 * 根据商品id查询商品的全部信息
	 * @param goodsid  商品id
	 * @return 返回查询后的商品
	 */
	public Goods getGoodsById(int goodsId);
	/**
	 * 
	 * @param goodId
	 * @return
	 */
	public Goods getGoodsByIdForOrder(int goodId);
}