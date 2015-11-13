package com.test.service.impl;

import javax.annotation.Resource;

import com.test.bean.User;
import com.test.dao.IUsersDao;
import com.test.service.IUsersService;

public class UsersServiceImpl implements IUsersService {
	@Resource(name="usersdao")	
	private IUsersDao dao;
	
	@Override
	public void register(User user){
		dao.addUsers(user);
	}
	/* (non-Javadoc)
	 * @see com.test.service.impl.IUsersService#getDao()
	 */
	
	public IUsersDao getDao() {
		return dao;
	}
	public void setDao(IUsersDao dao) {
		this.dao = dao;
	}
	
}
