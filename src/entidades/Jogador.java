package entidades;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Jogador extends Rectangle {

	private static final long serialVersionUID = 1L;
	public int spd = 4;
	public boolean right,up,down,left;
	Mundo mundo = new Mundo();
	
	public Jogador(int x, int y) {
		super(x, y, 32, 32);
	}
	
	public void tick() {
		if (right && mundo.estaLivre(x+spd, y)) {
			x+=spd;
		} else if (left && mundo.estaLivre(x-spd, y)) {
			x-=spd;
		}
		
		if (up && mundo.estaLivre(x, y-spd)) {
			y-=spd;
		} else if (down && mundo.estaLivre(x, y+spd)) {
			y+=spd;
		}
	}
	
	public void render(Graphics g) {
		//g.setColor(Color.orange);
		//g.fillRect(x, y, width, height);
		g.drawImage(SpriteSheet.jogador_frontal,x,y,32,32,null);
		
	}

}
