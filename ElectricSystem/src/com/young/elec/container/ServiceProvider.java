package com.young.elec.container;

import org.apache.commons.lang.StringUtils;

@SuppressWarnings("static-access")
public class ServiceProvider {
	
	public static ServiceProviderCord spc = null;
	//加载beans.xml文件
	static {
		System.out.println("aaaaaaaaaa");
		spc = new ServiceProviderCord();
		spc.load("/beans.xml");
	}
	
	public static Object getService(String serviceName) {
		System.out.println("bbbbbbbbbbb");
		Object object = null;
		if(StringUtils.isBlank(serviceName)) {
			System.out.println("StringUtils.isNotBlank(serviceName)执行了");
			throw new RuntimeException("当前服务名称不存在");
		} 
		if(spc.ac.containsBean(serviceName)) {
			object = spc.ac.getBean(serviceName);
			System.out.println("getBean执行了");
		}
		if(object == null) {
			throw new RuntimeException("当前服务名称【" + serviceName + "】下的节点不存在" );
		}
		return object;
	}
	
}
