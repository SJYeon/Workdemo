package com.test.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Consigneeinfo;
import com.test.dao.IConsigneeinfoDao;

public class ConsigneeinfoDaoImpl extends HibernateDaoSupport implements IConsigneeinfoDao {
	/* (non-Javadoc)
	 * @see com.test.dao.impl.IConsigneeinfoDao#getCginfoByUserid(int)
	 * 
	 * 通过用户id 查询用户的所有收货人信息
	 */
	@Override
	public List<Consigneeinfo> getCginfoByUserid(int userid){
		Object[] args = {userid};
		List<Consigneeinfo> list = this.getHibernateTemplate().find("from com.test.bean.Consigneeinfo c where userid=?", args);
		return list;
	}
	/* (non-Javadoc)
	 * @see com.test.dao.impl.IConsigneeinfoDao#addCginfo(com.test.bean.Consigneeinfo)
	 * 
	 * 添加收货人信息
	 */
	@Override
	public boolean addCginfo(Consigneeinfo cginfo){
		try{
			this.getHibernateTemplate().save(cginfo);
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
}
