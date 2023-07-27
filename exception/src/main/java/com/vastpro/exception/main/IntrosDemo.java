package com.vastpro.exception.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class IntrosDemo {
	public static void main(String[] args) throws Exception {
		PoliceStation p1 = new PoliceStation();
		Politician kabali = new Politician();
		Tailor kuppuswamy = new Tailor();
		// p1.arrest(kuppuswamy);
		p1.arrest(kabali);
	}
}

class Politician {
	public String name = "I am a good man...naan rombo nallavan...busy...";
	private String secretName = "gunda...";

	public void socialWork() {
		System.out.println("I am a good man.....");
	}

	private void stealPublicMoney() {
		System.out.println("my money my money ..your money my money.....");
	}
}

class Tailor {
	public String name = "gentleman";
}

class PoliceStation {
	public void arrest(Object p) throws Exception {
		Class c = p.getClass();
		Field f = c.getField("name");
		System.out.println(f.get(p));

		Method m = c.getMethod("socialWork");
		m.invoke(p);

		// torture room

		f = c.getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(p));

		m = c.getDeclaredMethod("stealPublicMoney");
		m.setAccessible(true);
		m.invoke(p);

	}
}
