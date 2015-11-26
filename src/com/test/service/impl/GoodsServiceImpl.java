package com.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.test.bean.Address;
import com.test.bean.Goods;
import com.test.bean.Users;
import com.test.dao.IGoodsDao;
import com.test.service.IGoodsService;

public class GoodsServiceImpl implements IGoodsService {
	@Resource(name="goodsdao")
	private IGoodsDao dao;
 	
	@Override
	public List<Goods> searchGoods(String cont, Address address) {
		// TODO Auto-generated method stub
		List<Goods> list = dao.searchGoods(cont, address);
				
		return list;
	}
	@Override
	public Goods getGoodsById(int goodsId) {
		Goods goods = dao.getGoodsById(goodsId);
		// TODO Auto-generated method stub
		return goods;
	}
	public IGoodsDao getDao() {
		return dao;
	}
	public void setDao(IGoodsDao dao) {
		this.dao = dao;
	}

	
}
