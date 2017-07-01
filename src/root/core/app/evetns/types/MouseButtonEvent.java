package root.core.app.evetns.types;

import root.core.app.evetns.Event;

public class MouseButtonEvent extends Event {
	
	private int keyCode, x, y;

	protected MouseButtonEvent(Type type, int keyCode, int x, int y) {
		super(type);
		this.x = x;
		this.y = y;
		this.keyCode = keyCode;
		
	}

	public int getKeyCode() {
		return keyCode;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
