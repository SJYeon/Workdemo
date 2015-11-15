package com.test.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import java.sql.Date;

import javax.annotation.Resource;

import com.test.basis.MD5;
import com.test.bean.Users;
import com.test.dao.IUsersDao;
import com.test.service.IUsersService;
/**
 * @author Fu 
 * Users表的中间服务层
 */
public class UsersServiceImpl implements IUsersService {
	@Resource(name="usersdao")	
	private IUsersDao dao;
	
	@Override
	public int register(Users users){
		try {
			// 对密码进行MD5加密
			users.setPassword(MD5.md5(users.getPassword()));
			//设置注册时间
			users.setRegistratetime(new Date(System.currentTimeMillis()));

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//调用底层插入操作
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

	@Override
	public boolean login(Users users) {
		// TODO Auto-generated method stub
		//调用底层查找操作
		Users us = dao.getUsersByPhone(users.getPhone());
		try {
			if(us != null){
				//对面进行MD5加密
				String pwdmd5 = MD5.md5(users.getPassword());
				//判断密码是否相同
				if(pwdmd5.equals(us.getPassword())){
				return true;
				}
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
}
