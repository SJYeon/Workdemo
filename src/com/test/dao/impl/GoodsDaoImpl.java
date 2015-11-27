package com.test.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Address;
import com.test.bean.Goods;
import com.test.bean.Proxys;
import com.test.bean.Users;
import com.test.dao.IGoodsDao;

public class GoodsDaoImpl extends HibernateDaoSupport implements IGoodsDao {

	@Override
	public List<Goods> searchGoods(String cont,Address address) {
		// TODO Auto-generated method stub
		List<Goods> list = null;
		//province='陕西' and city='西安市' AND area='雁塔区' and `local`='西安电子科技大学老校区' and 
		try{
		Object[] args = {address.getProvince(), address.getCity(), 
					address.getArea(), address.getLocal(),
					'%'+cont+'%', '%'+cont+'%', '%'+cont+'%', '%'+cont+'%'};
		
		list = this.getHibernateTemplate().find("from com.test.bean.Goods g " +
				"where province=? and city=? and area=? and local=? and" +
				" (goodsname like ? or 'desc' like ? " +
				"or smallproperty like ? or bigproperty like ?)" , args);
	
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return list;
	}

	@Override
	public Goods getGoodsById(int goodsId) {
		// TODO Auto-generated method stub
		
		Object[] args = {goodsId};
		try{
			
			List<Goods> list= this.getHibernateTemplate().find("from com.test.bean.Goods g " +
					"where id=?", args);
			if(list.size()>0){
				return list.get(0);
			}
	
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return null;
	}
	
}
