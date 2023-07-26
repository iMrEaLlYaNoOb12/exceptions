package exceptions;

import handler.Handler911;

public class DogBiteException extends DogExceptions {
	@Override
	public void visit() {
		new Handler911().handle(this);
	}
}
