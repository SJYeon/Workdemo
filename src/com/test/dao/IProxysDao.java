package com.test.dao;

import com.test.bean.Proxys;

import java.util.List;

public interface IProxysDao {
	/**
	 * 添加 超市 代理
	 * @param pro
	 * @return
	 */
	public abstract int addProxys(Proxys pro);
	
	public abstract List<Proxys> getUnionMembers(int proid);
	/**
	 * 根据超市代理 id查询 相应的超市信息
	 * @param proid
	 * @return
	 */
	public Proxys getProxysById(int proid);
}