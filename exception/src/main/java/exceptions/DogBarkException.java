package exceptions;

import handler.Handler911;

public class DogBarkException extends DogExceptions {
	@Override
	public void visit() {
		new Handler911().handle(this);
	}
}