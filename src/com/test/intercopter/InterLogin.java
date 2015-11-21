package com.test.intercopter;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class InterLogin extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		String userid = (String) ServletActionContext.getRequest().getSession().getAttribute("userid");
		if(userid.equals("") || userid == null){
			return "login";
		}
		return null;
	}

}
