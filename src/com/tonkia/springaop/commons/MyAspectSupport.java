package com.tonkia.springaop.commons;

import org.aspectj.lang.JoinPoint;

public class MyAspectSupport {
	public void before() {
		System.out.println("前置增强！");
	}

	public void beforeArg(JoinPoint jp) {
		System.out.println("前置增强！");
		System.out.println("参数：" + jp.getArgs()[0]);
		System.out.println("调用方法：" + jp.getSignature().getName());
	}

	public void after() {
		System.out.println("后置增强！");
	}
}
