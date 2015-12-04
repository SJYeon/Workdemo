package com.test.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.test.bean.OrderAll;
import com.test.bean.Orderaddress;
import com.test.bean.Ordergoods;
import com.test.bean.Orders;
import com.test.bean.Orderseller;
import com.test.bean.Proxys;
import com.test.bean.Users;
import com.test.service.IOrdersService;
import com.test.service.IProxysService;
import com.test.service.IUsersService;

public class OrdersAction {
	/**
	 * 直接购买页面信息
	 */
	private Orders orders;
	private Orderaddress orderaddress;
	private Orderseller orderseller;
	private Ordergoods ordergoods;
	
	@Resource(name="ordersser")
	private IOrdersService orderSer;
	
	@Resource(name="usersservice")
	private IUsersService userSer;
	
	@Resource(name="proxyser")
	private IProxysService proSer;
	
	public String addOrdersForBuyNow(){
		/**
		 * 获取用户信息 并插入到订单信息中 
		 */
		int userid = (Integer) ServletActionContext.getRequest().getSession().getAttribute("userid");
		Users user = userSer.getUsersById(userid);
		orders.setUsersByUserid(user);
		
		
		OrderAll oall = new OrderAll();
		
		List<Ordergoods> goodslist = new ArrayList<Ordergoods>();
		goodslist.add(ordergoods);
		oall.setOrder(orders);
		oall.setOrderaddress(orderaddress);
		oall.setOrderseller(orderseller);
		oall.setList(goodslist);
			
		boolean result = orderSer.addOrder(oall);
		
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
	public Orderaddress getOrderaddress() {
		return orderaddress;
	}
	public void setOrderaddress(Orderaddress orderaddress) {
		this.orderaddress = orderaddress;
	}
	public Orderseller getOrderseller() {
		return orderseller;
	}
	public void setOrderseller(Orderseller orderseller) {
		this.orderseller = orderseller;
	}
	public Ordergoods getOrdergoods() {
		return ordergoods;
	}
	public void setOrdergoods(Ordergoods ordergoods) {
		this.ordergoods = ordergoods;
	}
	
}
