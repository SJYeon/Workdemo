package com.test.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Proxys;
import com.test.dao.IProxysDao;

public class ProxysDaoImpl extends HibernateDaoSupport implements IProxysDao {

	@Override
	public int addProxys(Proxys pro) {
		// TODO Auto-generated method stub
		try{    		
    		this.getHibernateTemplate().save(pro);
    		return 1;
    	}
    	catch(Exception e){
    		System.out.println(e.getMessage());
    		return 0;
    	}
	}

	@Override
	public List<Proxys> getUnionMembers(int proid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proxys getProxysById(int proid) {
		// TODO Auto-generated method stub
		Object[] args = {proid};
		List<Proxys> list = this.getHibernateTemplate().find("from com.test.bean.Proxys p where p.id=?", args);
		if(list.size() > 0){
			return list.get(0);
		}
		return null;
	}

}
