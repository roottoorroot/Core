package root.core.sandbox;

import root.core.app.evetns.Event;
import root.core.layers.Layer;

public class Example extends Layer {
	public void onEvent(Event event) {
		System.out.println(event);
	}
}
