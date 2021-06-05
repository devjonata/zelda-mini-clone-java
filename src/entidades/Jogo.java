package entidades;

import java.awt.Canvas;
import java.awt.Dimension;

public class Jogo extends Canvas implements Runnable {
	private static final long serialVersionUID = 1L;
	public static int WIDTH = 480, HEIGTH = 480;
	
	public Jogo() {
		this.setPreferredSize( new Dimension(WIDTH,HEIGTH));
	}

	@Override
	public void run() {
		while(true) {
		System.out.println("Chamando game looping!");
		}
	}

}
