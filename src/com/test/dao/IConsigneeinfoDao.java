package com.test.dao;

import java.util.List;

import com.test.bean.Consigneeinfo;

public interface IConsigneeinfoDao {

	/**
	 * 通过用户id得到 用户的所有的收货人信息
	 * @param userid
	 * @return 
	 */
	public abstract List<Consigneeinfo> getCginfoByUserid(int userid);

	/**
	 * 添加收货人信息
	 * @param cginfo
	 * @return
	 */
	public abstract boolean addCginfo(Consigneeinfo cginfo);

}