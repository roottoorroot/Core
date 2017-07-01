package root.core.sandbox;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import root.core.app.evetns.Dispatcher;
import root.core.app.evetns.Event;
import root.core.app.evetns.types.MouseMotionEvent;
import root.core.app.evetns.types.MousePressedEvent;
import root.core.app.evetns.types.MouseReleasedEvent;
import root.core.layers.Layer;

public class Example extends Layer {
	
	private String name;
	private Color color;
	private Rectangle rect;
	
	private static final Random rnd = new Random();
	
	
	public Example(String name, Color color) {
		this.name = name;
		this.color = color;
		rect = new Rectangle(rnd.nextInt(100) + 150, rnd.nextInt(100) + 250, 120, 240);
	}
	
		
	
	public void onEvent(Event event) {
		Dispatcher dispatcher = new Dispatcher(event);
		dispatcher.dispatch(Event.Type.MOUSE_PRESSED, (Event e) -> onPressed((MousePressedEvent)e));
		dispatcher.dispatch(Event.Type.MOUSE_RELEASED, (Event e) -> onReleased((MouseReleasedEvent)e));
		dispatcher.dispatch(Event.Type.MOUSE_MOVED, (Event e) -> onMoved((MouseMotionEvent)e));
	}
	
	
	public void onRender(Graphics g) {
		g.setColor(color); //Color of rectangle;
		g.fillRect(rect.x, rect.y, rect.width, rect.height);
		
		g.setColor(Color.WHITE);
		g.drawString(name, rect.x + 15, rect.y + 35);
	}
	
	
	private boolean onPressed(MousePressedEvent event) {
		if (rect.contains(new Pont(event.getX(), event.getY())));
	}
	
	private boolean onReleased(MouseReleasedEvent event) {
		System.out.println("Mouse released: "  + event.getKeyCode());
		return false;
	}
	
	private boolean onMoved(MouseMotionEvent event) {
		System.out.println("Mouse moved "  + event.getX() + " | " + event.getY());
		return false;
	}
}
