package root.core.app.evetns.types;

import root.core.app.evetns.Event;

public class MousePressedEvent extends MouseButtonEvent {

	public MousePressedEvent(int keyCode, int x, int y) {
		super(Event.Type.MOUSE_PRESSED, keyCode, x, y);
		// TODO Auto-generated constructor stub
	}
	
}
