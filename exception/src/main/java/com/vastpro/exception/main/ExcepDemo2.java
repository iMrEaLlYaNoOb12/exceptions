package com.vastpro.exception.main;

import java.util.Scanner;

public class ExcepDemo2 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Dog tiger = new Dog();
		Child baby = new Child();

		System.out.println("Please enter the item class name...:");
		String itemclassname = scan.nextLine();
		Item item = (Item) Class.forName(itemclassname).newInstance();

		baby.playWithDog(tiger, item);
	}

}

class Handler911 {
	public void handle(DogBiteException dbe) {
		System.out.println("hold on we are sending ambulance.....");
	}

	public void handle(DogBarkException dre) {
		System.out.println("barking dogs seldom bite......");
	}

	public void handle(DogPlayException dpe) {
		System.out.println("enjoy, dog wants to play with you....");
	}

	public void handle(DogHappyException dpe) {
		System.out.println("enjoy, dog is very happy...have fun.........");
	}
}

class Dog {
	public void play(Item item) throws DogExceptions {
		item.play();
	}
}

class Child {
	public void playWithDog(Dog dog, Item item) throws DogExceptions {
		//dog.play(item);
		try {
			dog.play(item);
		} catch (DogExceptions de) {
			de.printStackTrace();
			de.visit();
		}
	}
}

abstract class Item {
	public abstract void play() throws DogExceptions;
}

class StickItem extends Item {
	@Override
	public void play() throws DogExceptions {
		throw new DogBiteException();
	}
}

class StoneItem extends Item {
	@Override
	public void play() throws DogExceptions {
		throw new DogBarkException();
	}
}

class BallItem extends Item {
	@Override
	public void play() throws DogExceptions {
		throw new DogPlayException();
	}
}

class BiscuitItem extends Item {
	@Override
	public void play() throws DogExceptions {
		throw new DogHappyException();
	}
}

abstract class DogExceptions extends Exception {
	abstract void visit();
}

class DogBiteException extends DogExceptions {
	@Override
	void visit() {
		new Handler911().handle(this);
	}
}

class DogBarkException extends DogExceptions {
	@Override
	void visit() {
		new Handler911().handle(this);
	}
}

class DogPlayException extends DogExceptions {
	@Override
	void visit() {
		new Handler911().handle(this);
	}
}

class DogHappyException extends DogExceptions {
	@Override
	void visit() {
		new Handler911().handle(this);
	}
}
