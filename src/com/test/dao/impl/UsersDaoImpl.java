package com.test.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.User;
import com.test.dao.IUsersDao;

public class UsersDaoImpl extends HibernateDaoSupport implements IUsersDao {
    /* (non-Javadoc)
	 * @see com.test.dao.impl.IUsersDao#addUsers(com.test.bean.User)
	 */
    @Override
	public void addUsers(User user){
    	this.getHibernateTemplate().save(user);
    }
}
