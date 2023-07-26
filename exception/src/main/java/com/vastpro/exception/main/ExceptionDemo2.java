package com.vastpro.exception.main;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("before exception...");
		if(args.length>0) {
			String s=args[0];
			if(Character.isDigit(s.charAt(0))) {
				int n=Integer.parseInt(s);
				if(n==0) {
					System.out.println("Please enter a number other than zero...");
				}
				else {
					int x=1/n;
				}
			}
			else {
				System.out.println("Please enter a number value...");
			}
		}
		else {
			System.out.println("please enter a argument value...");
		}
	}
}
