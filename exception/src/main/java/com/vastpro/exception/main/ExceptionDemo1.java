package com.vastpro.exception.main;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("before exception...");
		try {
			int i = 1 / 0;
			int numbers[] = { 10, 220, 340 };
			System.out.println(numbers[3] );
		} catch (ArithmeticException e) {
			System.out.println("muttai muttai......");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("illai illai");
		} catch (Exception e) {

		} finally {
			System.out.println("finally called....");
		}
		System.out.println("After exception...");
	}
}
