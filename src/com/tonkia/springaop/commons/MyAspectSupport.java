package com.tonkia.springaop.commons;

import org.aspectj.lang.JoinPoint;

public class MyAspectSupport {
	public void before() {
		System.out.println("ǰ����ǿ��");
	}

	public void beforeArg(JoinPoint jp) {
		System.out.println("ǰ����ǿ��");
		System.out.println("������" + jp.getArgs()[0]);
		System.out.println("���÷�����" + jp.getSignature().getName());
	}

	public void after() {
		System.out.println("������ǿ��");
	}
}
