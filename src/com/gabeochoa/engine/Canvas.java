package com.gabeochoa.engine;

import java.awt.Graphics;

import javax.swing.JComponent;

public class Canvas extends JComponent{

	private Game game;
	private Input input;

	public Canvas(Game game){
		this.game = game;
		 addKeyListener(game);
	        addMouseListener(game);
	        addMouseMotionListener(game);
		requestFocus();
	}
	
	public void paintComponent(Graphics g)
	{
		game.draw(g);
	}
}
