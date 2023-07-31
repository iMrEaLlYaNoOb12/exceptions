package com.vastpro.introspection.me.main;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import com.vastpro.introspection.me.main.*;

public class ReflectionMain {
	static Corona corona = new Corona();

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the property name...:");
		System.out.println("property names are..:name,infectious,c,s");
		String property = scan.nextLine();
		getSuperClass(corona, property);
	}

	static void getSuperClass(Object obj, String property) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class subclass = obj.getClass();

		findSuperClass(subclass, property);

	}

	static void findSuperClass(Class cls, String property) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class superclass = cls.getSuperclass();
		if (superclass != null) {
			for (Field f : superclass.getDeclaredFields()) {
				if (f.getName().equals(property)) {
					if (f.getType() == String.class) {
						String var = f.getName();
						String mod = "get" + Character.toUpperCase(var.charAt(0)) + var.substring(1);
						System.out.println(mod);
						Class subC = corona.getClass();
						Method met = subC.getDeclaredMethod(mod);
						System.out.println(met.invoke(corona));

					} else if (f.getType() == boolean.class) {
						String var = f.getName();
						String mod = "is" + Character.toUpperCase(var.charAt(0)) + var.substring(1);
						System.out.println(mod);
						Class subC = corona.getClass();
						Method met = subC.getDeclaredMethod(mod);
						System.out.println(met.invoke(corona));
					}
				}
			}
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
