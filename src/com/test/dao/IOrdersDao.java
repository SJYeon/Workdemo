package com.test.dao;

import com.test.bean.OrderAll;
import com.test.bean.Orders;

public interface IOrdersDao {
	/**
	 * 插入单个订单
	 * @return 返回是否插入成功
	 */
	public boolean addorder(OrderAll orderall);
}