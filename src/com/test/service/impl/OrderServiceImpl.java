package com.test.service.impl;

import java.sql.Date;

import javax.annotation.Resource;

import com.test.bean.Orderaddress;
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
		os = order.getOrderseller();
//		os.setPid(order.getOrderseller().getPid());
//		os.setPname(order.getOrderseller().getPname());
		order.setOrderseller(os);
		
		Orderaddress oa = new Orderaddress();
		oa = order.getOrderaddress();
//		oa.setAddress(order.getOrderaddress().getAddress());
		order.setOrderaddress(oa);
		
		for(int i = 0; i< order.getOrdergoodses().size(); i++){
			order.getOrdergoodses().get(i).setOrders(order);
		}
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
