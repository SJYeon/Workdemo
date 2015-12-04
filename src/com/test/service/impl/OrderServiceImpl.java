package com.test.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.test.bean.OrderAll;
import com.test.bean.Orderaddress;
import com.test.bean.Ordergoods;
import com.test.bean.Orders;
import com.test.bean.Orderseller;
import com.test.dao.IOrdersDao;
import com.test.service.IOrdersService;

public class OrderServiceImpl implements IOrdersService {
	@Resource(name="ordersdao")
	private IOrdersDao dao;

	public IOrdersDao getDao() {
		return dao;
	}
	public void setDao(IOrdersDao dao) {
		this.dao = dao;
	}
	@Override
	public boolean addOrder(OrderAll orderall) {
		// TODO Auto-generated method stub
		/**
		 * 向订单表中添加 地址信息 和 商户信息
		 */
		orderall.getOrder().setOrderaddress(orderall.getOrderaddress());
		orderall.getOrder().setOrderseller(orderall.getOrderseller());
		/**
		 * 设置订单时间与版本
		 */
		orderall.getOrder().setOrdertime(new Date(System.currentTimeMillis()));
		orderall.getOrder().setVersion(0);
		/**
		 * 向商品中 加入订单信息
		 */
		for(int i = 0; i < orderall.getList().size(); i++){	
			orderall.getList().get(i).setOrders(orderall.getOrder());
		}
		//调用底层操作
		boolean result = dao.addorder(orderall);
		return result;
	}
	
}
