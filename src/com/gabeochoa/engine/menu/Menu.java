package com.gabeochoa.engine.menu;

import java.awt.Graphics;

import com.gabeochoa.engine.*;

public class Menu {

	public int selectedOption = 0;
	public Graphics g;
	
	public void paint(Graphics gr)
	{
		g = gr;
		drawMenu();
	}
	public void drawMenu(){}
	
	public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean select){}
	
}
