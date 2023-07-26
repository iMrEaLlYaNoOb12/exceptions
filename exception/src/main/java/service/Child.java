package service;

import exceptions.DogExceptions;
import items.Item;

public class Child {
	public void playWithDog(Dog dog, Item item) {
		try {
			dog.play(item);
		} catch (DogExceptions de) {
			de.printStackTrace();
			de.visit();
		}
	}
}
