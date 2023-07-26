package items;

import exceptions.DogExceptions;

public abstract class Item {
	public abstract void play() throws DogExceptions;
}



















//class StickItem extends Item {
//	@Override
//	public void play() throws DogExceptions {
//		throw new DogBiteException();
//	}
//}
//
//class StoneItem extends Item {
//	@Override
//	public void play() throws DogExceptions {
//		throw new DogBarkException();
//	}
//}
//
//class BallItem extends Item {
//	@Override
//	public void play() throws DogExceptions {
//		throw new DogPlayException();
//	}
//}
//
//class BiscuitItem extends Item {
//	@Override
//	public void play() throws DogExceptions {
//		throw new DogHappyException();
//	}
//}
