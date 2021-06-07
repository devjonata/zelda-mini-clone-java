package entidades;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {
	
	public static BufferedImage spritesheet;
	public static BufferedImage jogador_frontal;
	
	public SpriteSheet() {
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		jogador_frontal = SpriteSheet.getSprite(0, 11, 16, 16);
	}
	
	public static BufferedImage getSprite(int x, int y, int width, int reight) {
		return spritesheet.getSubimage(x, y, width, reight);
	}

}
