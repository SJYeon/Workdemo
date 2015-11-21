package com.test.service;

import java.util.List;

import com.test.bean.Consigneeinfo;
import com.test.dao.IConsigneeinfoDao;

public interface IConsigneeinfoService {

	public abstract List<Consigneeinfo> getConsigneeinfoByUserid(int userid);

	public abstract boolean addCginfo(Consigneeinfo cginfo);

	public abstract boolean deleteCginfo(int id);

	public abstract boolean updateCginfo(Consigneeinfo cginfo);
	
	public abstract Consigneeinfo getConsigneeinfoById(int id);
}