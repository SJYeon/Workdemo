package com.test.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderAll {
	private Orders order;
	private Orderaddress orderaddress;
	private Orderseller orderseller;
	private List<Ordergoods> list = new  ArrayList<Ordergoods>(0);
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
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
	public List<Ordergoods> getList() {
		return list;
	}
	public void setList(List<Ordergoods> list) {
		this.list = list;
	}
}
