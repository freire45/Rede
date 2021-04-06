package br.com.erickfreire.rede;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Crie um programa em Java que simula o desenho de uma rede
 * @author Erick Freire
 * @version 1 - Criado em 06-04-2021 as 18:18 
 */

public class Rede extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponents(g);

		int width = getWidth();
		int height = getHeight();
		int c =15;
		
		while(c<345){ 
		g.drawLine(0,c,c,height);
		c+=15;// 
		
	    }
		
	}

}
