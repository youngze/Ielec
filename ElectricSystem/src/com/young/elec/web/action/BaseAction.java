package com.young.elec.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.young.elec.web.form.*;
import com.opensymphony.xwork2.*;

@SuppressWarnings("serial")
public class BaseAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {

	@SuppressWarnings("unused")
	protected HttpServletRequest request = null;
	
	@SuppressWarnings("unused")
	protected HttpServletResponse response = null;
		
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	

}
