package aplicacao;

import javax.swing.JFrame;

import entidades.Jogo;

public class Programa {

	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		JFrame frame = new JFrame();
		
		frame.add(jogo);
		frame.setTitle("Mini Zelda");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		new Thread(jogo).start();
	}

}
