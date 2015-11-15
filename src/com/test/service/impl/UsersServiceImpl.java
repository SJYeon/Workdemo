package com.test.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import java.sql.Date;

import javax.annotation.Resource;

import com.test.basis.MD5;
import com.test.bean.Users;
import com.test.dao.IUsersDao;
import com.test.service.IUsersService;

public class UsersServiceImpl implements IUsersService {
	@Resource(name="usersdao")	
	private IUsersDao dao;
	
	@Override
	public int register(Users users){
		try {
			users.setPassword(MD5.md5(users.getPassword()));
			users.setRegistratetime(new Date(System.currentTimeMillis()));
			users.setIntegral(0);
			users.setUserclass("ordinary");
			users.setVersion(0);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dao.addUsers(users);
		
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
