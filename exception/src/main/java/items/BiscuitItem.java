package items;

import exceptions.DogExceptions;
import exceptions.DogHappyException;

public class BiscuitItem extends Item {
	@Override
	public void play() throws DogExceptions {
		throw new DogHappyException();
	}
}
