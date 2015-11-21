package com.test.service;

import java.util.List;

import com.test.bean.Consigneeinfo;
import com.test.dao.IConsigneeinfoDao;

public interface IConsigneeinfoService {
	/**
	 * 获取用户收货人信息列表 通过用户id
	 * @param userid
	 * @return
	 */
	public abstract List<Consigneeinfo> getConsigneeinfoByUserid(int userid);
	/**
	 * 添加收货人信息
	 * @param cginfo
	 * @return
	 */
	public abstract boolean addCginfo(Consigneeinfo cginfo);
	/**
	 * 通过id删除相应的收货人信息
	 * @param id
	 * @return
	 */
	public abstract boolean deleteCginfo(int id);
	/**
	 * 更新收货人信息
	 * @param cginfo
	 * @return
	 */
	public abstract boolean updateCginfo(Consigneeinfo cginfo);
	/**
	 * 通过id查找收货人信息
	 * @param id
	 * @return
	 */
	public abstract Consigneeinfo getConsigneeinfoById(int id);
	
	
}