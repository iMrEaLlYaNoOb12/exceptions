package items;

import exceptions.DogBarkException;
import exceptions.DogExceptions;

public class StoneItem extends Item {
	@Override
	public void play() throws DogExceptions {
		throw new DogBarkException();
	}
}
