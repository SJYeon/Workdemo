package com.test.service.impl;

import java.sql.Date;

import javax.annotation.Resource;

import com.test.bean.Orders;
import com.test.bean.Orderseller;
import com.test.dao.IOrdersDao;
import com.test.service.IOrdersService;

public class OrderServiceImpl implements IOrdersService {
	@Resource(name="ordersdao")
	private IOrdersDao dao;
	@Override
	public boolean addOrder(Orders order) {
//		 TODO Auto-generated method stub
		
		Orderseller os = new Orderseller();
		os.setPid(order.getOrderseller().getPid());
		os.setPname(order.getOrderseller().getPname());
		os.setProxys(order.getOrderseller().getProxys());
		order.setOrderseller(os);
		
		//添加订单生成时间 版本号 
		order.setOrdertime(new Date(System.currentTimeMillis()));
		order.setVersion(0);

		boolean result = dao.addorders(order);
		return result;
	}
	public IOrdersDao getDao() {
		return dao;
	}
	public void setDao(IOrdersDao dao) {
		this.dao = dao;
	}
	
}
