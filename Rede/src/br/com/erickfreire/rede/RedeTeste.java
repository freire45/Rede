package br.com.erickfreire.rede;

import javax.swing.JFrame;

public class RedeTeste {
	public static void main(String[] args) {
		Rede painel = new Rede();
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		aplicacao.add(painel);
		aplicacao.setSize(250,250);
		aplicacao.setVisible(true);
		
	}

}
