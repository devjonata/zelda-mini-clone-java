package entidades;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Jogo extends Canvas implements Runnable {
	private static final long serialVersionUID = 1L;
	public static int WIDTH = 480, HEIGTH = 480;
	
	public Jogo() {
		this.setPreferredSize( new Dimension(WIDTH,HEIGTH));
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGTH);
		
		g.setColor(Color.red);
		g.fillRect(50, 50, 100, 100);
		
		bs.show();
		
	}

	@Override
	public void run() {
		while(true) {
		System.out.println("Chamando game looping!");
		render();
		}
	}

}
