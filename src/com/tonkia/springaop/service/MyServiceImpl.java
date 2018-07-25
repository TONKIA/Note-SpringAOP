package com.tonkia.springaop.service;

public class MyServiceImpl implements MyService {

	public void service() {
		System.out.println("service running");
	}

	public String func(String str) {
		return "-----" + str + "-----";
	}
}
