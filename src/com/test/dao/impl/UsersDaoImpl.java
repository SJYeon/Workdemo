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
    /**
     * 通过id查找用户
     */
	@Override
	public Users getUsersById(int id) {
		// TODO Auto-generated method stub
		
		Object[] args = {id};
		List<Users> list = this.getHibernateTemplate().find("from com.test.bean.Users u where id=?", args);
		Users users = null;
		if(list.size()>0){
			users = list.get(0);
		}
		
		return users;
	}

	@Override
	public boolean deleteUsersById(int id) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Users getUsersByPhone(String phone) {
		// TODO Auto-generated method stub
		Object[] args = {phone};
		List<Users> list = this.getHibernateTemplate().find("from com.test.bean.Users u where phone=?",args);
		Users users = null;
		if(list.size()>0){
			users = list.get(0);
		}
		return users;
	}
	@Override
	public List<Users> getUnionMembers(int userid) {
		// TODO Auto-generated method stub
		try{
			Object[] args = {userid};
			List<Users> list = this.getHibernateTemplate().find("from com.test.bean.Users u where inviter=?", args);
			return list;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}
}
