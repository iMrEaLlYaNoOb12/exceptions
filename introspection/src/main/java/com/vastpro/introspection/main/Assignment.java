package com.vastpro.introspection.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Disease corona = new Corona();
		System.out.println("Please enter the property name...:");
		System.out.println("property names are..:name,infectious,c,s");
		String property = scan.nextLine();
//		Class c = corona.getClass();
//
//		Method m = c.getDeclaredMethod("getName");
//		m.setAccessible(true);
//		m.invoke(corona);

		Assignment.findsuperclass(corona);

	}

	static void findsuperclass(Object o) throws Exception {
		Class subclass = o.getClass();
		Class superclass = subclass.getSuperclass();
		if (superclass != null) {
			Field f = superclass.getDeclaredField("name");
			System.out.println(f.get(o));
			findsuperclass(superclass);

		}

	}
}

class Disease {
	public String name = "infectious";
	public boolean infectious = true;
	String c = "a";
	boolean s = false;
}

class Corona extends Disease {
	public String getName() {
		return this.name;
	}

	public boolean isInfectious() {
		return infectious;
	}

	String getC() {
		return this.c;
	}

	boolean isS() {
		return this.s;
	}
}