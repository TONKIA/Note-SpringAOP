package com.tonkia.springaop.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		// System.out.println(Target.class.getClassLoader());
		IShowable proxy = (IShowable) Proxy.newProxyInstance(Target.class.getClassLoader(),
				Target.class.getInterfaces(), new MyInvocationHandler());
		proxy.show();
	}
}

class MyInvocationHandler implements InvocationHandler {
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		System.out.println("before invoke");
		arg1.invoke(new Target(), arg2);
		System.out.println("after invoke");
		return null;
	}

}
