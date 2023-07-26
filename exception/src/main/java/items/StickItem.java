package items;

import exceptions.DogBiteException;
import exceptions.DogExceptions;

public class StickItem extends Item {
	@Override
	public void play() throws DogExceptions {
		throw new DogBiteException();
	}
}
