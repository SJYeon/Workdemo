package com.test.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Orders;
import com.test.dao.IOrdersDao;

public class OrdersDaoImpl extends HibernateDaoSupport implements IOrdersDao {

	@Override
	public boolean addorders(Orders order) {
		// TODO Auto-generated method stu
		try{
			this.getHibernateTemplate().save(order);
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

}
