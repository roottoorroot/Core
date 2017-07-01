package root.core.app.evetns.types;

import root.core.app.evetns.Event;

public class MouseReleasedEvent extends MouseButtonEvent{

	protected MouseReleasedEvent(int keyCode, int x, int y) {
		super(Event.Type.MOUSE_RELEASED, keyCode, x, y);
	}

}
