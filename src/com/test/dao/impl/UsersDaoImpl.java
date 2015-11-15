package com.test.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Users;

import com.test.dao.IUsersDao;

public class UsersDaoImpl extends HibernateDaoSupport implements IUsersDao {
    /* (non-Javadoc)
	 * @see com.test.dao.impl.IUsersDao#addUsers(com.test.bean.User)
	 */
    @Override
	public int addUsers(Users users){
    	try{    		
    		this.getHibernateTemplate().save(users);
    		return 1;
    	}
    	catch(Exception e){
    		System.out.println(e.getMessage());
    		return 0;
    	}
    }

	@Override
	public int getUsersById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUsersById(int idr) {
		// TODO Auto-generated method stub
		return 0;
	}
}
