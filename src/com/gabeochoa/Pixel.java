package com.gabeochoa;

import java.awt.Color;
import java.awt.Graphics;

public class Pixel {

	public int x,y, width, height;
	boolean wall = false;
	private Graphics g;
	
	public Pixel()
	{
	}

	public Pixel(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public boolean getWall(){return wall;}
	public void setWall(boolean w){wall=w;}
	
	public void paint(Graphics gr)
	{
		g = gr;
		draw();
	}
	public void draw()
	{
		//col = wall? Color.black : Color.white;
		if(wall)
		{
			g.setColor(Color.black);
			g.fillRect(x,y,width,height);
		}else{
			g.setColor(Color.white);
			g.drawRect(x,y,width,height);
			}
	}
}
