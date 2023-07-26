package exceptions;

import handler.Handler911;

public class DogHappyException extends DogExceptions {
	@Override
	public void visit() {
		new Handler911().handle(this);
	}
}
