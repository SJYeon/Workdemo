package com.test.service;

import com.test.bean.OrderAll;
import com.test.bean.Orders;

public interface IOrdersService {
	/**
	 * 插入单个订单
	 * @param order
	 * @return
	 */
	public boolean addOrder(OrderAll orderall);
}