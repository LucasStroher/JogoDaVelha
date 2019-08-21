package jogo;

import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {
		JogoPanel painel = new JogoPanel();
		painel.setFocusable(true);
		painel.requestFocus();
		
		JFrame frame = new JFrame();
		frame.add(painel);
		frame.setSize(600,640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}
