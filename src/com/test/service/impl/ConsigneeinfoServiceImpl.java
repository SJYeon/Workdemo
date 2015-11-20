package com.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.test.bean.Consigneeinfo;
import com.test.dao.IConsigneeinfoDao;
import com.test.service.IConsigneeinfoService;

public class ConsigneeinfoServiceImpl implements IConsigneeinfoService {
	@Resource(name="cginfodao")
	private IConsigneeinfoDao dao;
	
	/* (non-Javadoc)
	 * @see com.test.service.impl.IConsigneeinfoService#getConsigneeinfoByUserid(int)
	 */
	@Override
	public List<Consigneeinfo> getConsigneeinfoByUserid(int userid){
		List<Consigneeinfo> list = dao.getCginfoByUserid(userid);
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.test.service.impl.IConsigneeinfoService#addCginfo(com.test.bean.Consigneeinfo)
	 */
	@Override
	public boolean  addCginfo(Consigneeinfo cginfo){
		cginfo.setVersion(0);
		boolean result = dao.addCginfo(cginfo);
		return result;
	}
	
	/* (non-Javadoc)
	 * @see com.test.service.impl.IConsigneeinfoService#getDao()
	 */
	@Override
	public IConsigneeinfoDao getDao() {
		return dao;
	}

	/* (non-Javadoc)
	 * @see com.test.service.impl.IConsigneeinfoService#setDao(com.test.dao.IConsigneeinfoDao)
	 */
	@Override
	public void setDao(IConsigneeinfoDao dao) {
		this.dao = dao;
	}
	
	
	
}
