package com.vastpro.introspection.main;

import java.util.Scanner;

public class AssignmentD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Corona corona = new Corona();
//		System.out.println("Please enter the property name...:");
//		System.out.println("property names are..:name,infectious,c,s");
//		String p=scan.nextLine();
		findsuperclass(corona);

	}

	static void findsuperclass(Object o) {
		Class subclass = o.getClass();
		superclassiterate(subclass);
	}

	static void superclassiterate(Class c) {
		Class superclass = c.getSuperclass();
		if (superclass != null) {
			System.out.println(superclass);
			superclassiterate(superclass);
		} else {
			System.exit(0);
		}
	}
}

class Disease1 {
	public String name = "infectious";
	public boolean infectious = true;
	String c = "a";
	boolean s = false;
}

class Corona1 extends Disease {
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
