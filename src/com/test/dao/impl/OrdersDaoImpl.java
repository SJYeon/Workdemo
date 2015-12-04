package com.test.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.OrderAll;
import com.test.bean.Orders;
import com.test.dao.IOrdersDao;

public class OrdersDaoImpl extends HibernateDaoSupport implements IOrdersDao {

	@Override
	public boolean addorder(OrderAll orderall) {
		// TODO Auto-generated method stub
		try{
			this.getHibernateTemplate().save(orderall.getOrderaddress());
			this.getHibernateTemplate().save(orderall.getOrderseller());
			this.getHibernateTemplate().save(orderall.getOrder());
			for(int i = 0; i < orderall.getList().size(); i++){	
				this.getHibernateTemplate().save(orderall.getList().get(i));
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

}
