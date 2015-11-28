package com.test.service.impl;

import javax.annotation.Resource;

import com.test.bean.Proxys;
import com.test.dao.IProxysDao;
import com.test.service.IProxysService;

public class ProxyServiceImpl implements IProxysService {
	@Resource(name="proxysdao")
	private IProxysDao dao;
	@Override
	public Proxys getProxyById(int proid) {
		// TODO Auto-generated method stub
		Proxys proxy = dao.getProxysById(proid);
		return proxy;
	}
	public IProxysDao getDao() {
		return dao;
	}
	public void setDao(IProxysDao dao) {
		this.dao = dao;
	}
	
}
