package com.test.basis;

import org.apache.struts2.ServletActionContext;

public class ActionContext {
	public static void setRequestAttribute(String msgname, String msgcon){
		ServletActionContext.getRequest().setAttribute(msgname, msgcon);
	}
	public static void setSessiontAttribute(String msgname, String msgcon){
		ServletActionContext.getRequest().getSession().setAttribute(msgname, msgcon);
	}
}
