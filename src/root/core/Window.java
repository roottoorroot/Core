package root.core;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Window extends Canvas {
	
	private BufferStrategy bs;
	private Graphics g;
	private JFrame frame;
	
	public Window(String name, int width, int height) {
		setPreferredSize(new Dimension(width, height));
		init(name);
		render();
	}
	
	private void init(String name) {
		frame = new JFrame(name);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	private void render() {
		if (bs == null)
			createBufferStrategy(3);
		bs = getBufferStrategy();
		
		g = bs.getDrawGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		onRender(g);
		g.dispose(); //close pregrafic;
		bs.show(); //swap buffers
		
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(() -> render());
	}
	
	private void onRender(Graphics g) {
		
	}
	
}
