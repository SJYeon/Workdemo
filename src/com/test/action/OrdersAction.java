package com.test.action;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.test.bean.Orders;
import com.test.bean.Proxys;
import com.test.bean.Users;
import com.test.service.IOrdersService;
import com.test.service.IProxysService;
import com.test.service.IUsersService;

public class OrdersAction {
	private Orders orders;
	
	@Resource(name="ordersser")
	private IOrdersService orderSer;
	
	@Resource(name="usersservice")
	private IUsersService userSer;
	
	@Resource(name="proxyser")
	private IProxysService proSer;
	public String addOrdersForBuyNow(){
		
		int userid = (Integer) ServletActionContext.getRequest().getSession().getAttribute("userid");
		Users user = userSer.getUsersById(userid);
		orders.setUsersByUserid(user);

		
		boolean result = orderSer.addOrder(orders);
		return result?"success":"error";
	}
	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public IOrdersService getOrderSer() {
		return orderSer;
	}

	public void setOrderSer(IOrdersService orderSer) {
		this.orderSer = orderSer;
	}

	public IUsersService getUserSer() {
		return userSer;
	}

	public void setUserSer(IUsersService userSer) {
		this.userSer = userSer;
	}

	public IProxysService getProSer() {
		return proSer;
	}

	public void setProSer(IProxysService proSer) {
		this.proSer = proSer;
	}
	
}
