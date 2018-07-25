package com.tonkia.springaop.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tonkia.springaop.service.MyService;

public class AopTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyService ms = cpxac.getBean("myService", MyService.class);
		//ms.service();
		System.out.println(ms.func("tonkia"));
		cpxac.close();
	}

}
