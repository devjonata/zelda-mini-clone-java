package entidades;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Mundo {
	
	public List<Blocos> blocos = new ArrayList<Blocos>();
	
	public Mundo() {
		for (int i=0 ; i<15; i++) {
			blocos.add(new Blocos(i*32,0));
		}
		for (int i=0 ; i<15; i++) {
			blocos.add(new Blocos(i*32,480-32));
		}
		for (int i=0 ; i<15; i++) {
			blocos.add(new Blocos(0,i*32));
		}
		for (int i=0 ; i<15; i++) {
			blocos.add(new Blocos(480-32,i*32));
		}
	}
	
	public boolean estaLivre(int x, int y) {
		for (Blocos b : blocos) {
			if (b.intersects(new Rectangle(x,y,32,32))) {
				return false;
			}
		}
		return true;
	}
	
	public void render(Graphics g) {
		for (Blocos b : blocos) {
			b.render(g);
		}
	}

}
