package service;

import exceptions.DogExceptions;
import items.Item;

public class Dog {
	public void play(Item item) throws DogExceptions {
		item.play();
	}
}
