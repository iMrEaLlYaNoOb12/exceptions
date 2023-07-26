package handler;

import exceptions.DogBarkException;
import exceptions.DogBiteException;
import exceptions.DogHappyException;
import exceptions.DogPlayException;

public class Handler911 {
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
