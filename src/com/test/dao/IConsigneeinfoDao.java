package com.test.dao;

import java.util.List;

import com.test.bean.Consigneeinfo;

public interface IConsigneeinfoDao {

	
	public abstract List<Consigneeinfo> getCginfoByUserid(int userid);

	public abstract boolean addCginfo(Consigneeinfo cginfo);
	
	public abstract boolean deleteCginfo(int id);
    
	public abstract boolean updateCginfo(Consigneeinfo cginfo);
	
	public abstract Consigneeinfo getCginfoById(int id);
}