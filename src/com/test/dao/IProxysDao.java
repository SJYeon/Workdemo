package com.test.dao;

import com.test.bean.Proxys;

import java.util.List;

public interface IProxysDao {
	
	public abstract int addProxys(Proxys pro);
	
	public abstract List<Proxys> getUnionMembers(int proid);
	
}