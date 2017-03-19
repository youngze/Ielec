package com.young.elec.web.action;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import com.young.elec.util.*;
import com.young.elec.service.*;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.young.elec.domain.*;
import com.young.elec.web.form.*;
import com.opensymphony.xwork2.*;

public class ElecTextAction extends BaseAction implements ModelDriven<ElecTextForm> {

	private ElecTextForm elecTextForm = new ElecTextForm();
	private HttpServletRequest request = null;
	
	public ElecTextForm getModel() {
		return elecTextForm;
	}	
	
	public String save() {
		
		ElecText elecText = new ElecText();
		elecText.setTextName(elecTextForm.getTextName());
		elecText.setTextDate(StringHelper.stringConvertDate(elecTextForm.getTextDate()));
		elecText.setTextRemark(elecTextForm.getTextRemark());
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IElecTextService elecTextService = (IElecTextService)ac.getBean(IElecTextService.SERVICE_NAME);
		elecTextService.saveElecText(elecText);
		return "save";
	}

}
