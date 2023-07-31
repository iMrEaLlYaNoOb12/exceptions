package com.vastpro.introspection.main;

import java.lang.reflect.Method;

public class IntrosDemo3 {
	public static void main(String[] args) throws Exception {
		IntrosTest2 obj = new IntrosTest2();

		Class c = obj.getClass();

		// rahul gandhi code
		Method m = c.getDeclaredMethod("met", String.class, int.class);
		m.setAccessible(true);
		m.invoke(obj, "hello", 10);

		// gandhi code
		m = c.getDeclaredMethod("met", new Class[] { String.class, int.class });
		m.setAccessible(true);
		m.invoke(obj, new Object[] { "hello", 10 });
	}
}

class IntrosTest2 {
	public IntrosTest2() {
		// TODO Auto-generated constructor stub
	}

	public void met() {
		System.out.println("met called...empty");
	}

	private void met(String s, int i) {
		System.out.println(s + ":" + i);
	}
}