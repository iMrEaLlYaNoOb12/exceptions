package items;

import exceptions.DogExceptions;
import exceptions.DogPlayException;

public class BallItem extends Item {
	@Override
	public void play() throws DogExceptions {
		throw new DogPlayException();
	}
}
