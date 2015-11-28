package com.test.action;

import com.test.bean.Orders;

public class OrdersAction {
	private Orders orders;
	
	public String addOrders(){
		
		return "success";
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
}
