package com.gabeochoa;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.gabeochoa.engine.Application;
import com.gabeochoa.engine.Art;
import com.gabeochoa.engine.Game;

//@author Gabe Ochoa

public class wmup extends Game{

	private int x, y;
	
	public int[] mouse = new int[5];
	public boolean[] keys = new boolean[424242];
	
	private int my;
	private int mx;
	
	//private static final int HEIGHT = 720;
	//private static final int WIDTH = HEIGHT * 16/9;
	Pixel[][] pixels = new Pixel[50][50];

	private Graphics g;

	private boolean[][] mazeFile;
	
	// 
	
	public static void main(String args[])
	{
		Application.start(new wmup());
	}

	public wmup()
	{
		super();
		title = "TITLE";
		
		for(int i=0; i<pixels.length; i++)
				for(int j=0; j< pixels[i].length; j++)
				{
					pixels[i][j] = new Pixel(10*i, 10*j, 10,10);
				}
		
		mazeFile = ReadMaze.getMaze();
		
		for(int i=0; i<pixels.length; i++)
			for(int j=0; j< pixels[i].length; j++)
			{
				pixels[i][j].setWall(mazeFile[i][j]);
			}
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		handleInput();
		
		
	}

	private void handleInput() {
		mx = mouse[3];
		my = mouse[4];
		//System.out.println(""+mx+" , "+my);
		
	}

	@Override
	public void draw(Graphics gr) {
		g = gr;
		paint();//g.drawImage(Art.getImage("./res/SeeProjectGroupPhoto.png"), mx,my,null);
	}

	private void paint() {
		for(int i=0; i<pixels.length; i++)
			for(int j=0; j< pixels[i].length; j++)
					pixels[i][j].paint(g);
	}

	public void mouseMoved(MouseEvent m) {
		 mouse[3] = m.getX();
	     mouse[4] = m.getY();
	}
	
	public void mousePressed(MouseEvent m) {
		mouse[0] = m.getButton();
        mouse[1] = m.getX();
        mouse[2] = m.getY();
	}

	public void mouseReleased(MouseEvent m) {
		mouse[0] = 0;//arg0.getButton();
        mouse[1] = 0;//arg0.getX();
        mouse[2] = 0;//arg0.getY();
	}

	public void keyPressed(KeyEvent k) {
		int kc = k.getKeyCode();
		if( kc > 0 && kc < keys.length)
			keys[kc] = true;
	}

	public void keyReleased(KeyEvent k) {
		int kc = k.getKeyCode();
		if( kc > 0 && kc < keys.length)
			keys[kc] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}
