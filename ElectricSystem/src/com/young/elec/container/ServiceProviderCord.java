package com.young.elec.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceProviderCord {

	protected static ApplicationContext ac = null;
	
	//加载beans.xml文件(filename放置的是beans.xml)
	public static void load(String filename) {
		System.out.println("ServiceProviderCord执行了");
		ac = new ClassPathXmlApplicationContext(filename);
		
	}
	
}
