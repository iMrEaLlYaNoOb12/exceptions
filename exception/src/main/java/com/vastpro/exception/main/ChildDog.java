package com.vastpro.exception.main;

import java.util.Scanner;

import items.Item;
import service.Child;
import service.Dog;

public class ChildDog {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Scanner scan = new Scanner(System.in);
		Dog tiger = new Dog();
		Child baby = new Child();

		System.out.println("Please enter the item class name...:");
		String itemclassname = scan.nextLine();
		Item item = (Item) Class.forName(itemclassname).newInstance();

		baby.playWithDog(tiger, item);
		scan.close();
	}
}
