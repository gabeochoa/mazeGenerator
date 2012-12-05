package com.gabeochoa.engine;

import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public abstract class Game  implements KeyListener, MouseListener, MouseMotionListener{

	private static final int HEIGHT = 500;//720;
	private static final int WIDTH = 500;//HEIGHT * 16/9;
	public static String title;
	public boolean over;
	public int delay = 20;
	
	public abstract void init();
	public abstract void update();
	public abstract void draw(Graphics g);
	
	public boolean isOver() {
		return over;
	}
	public long getDelay() {
		return delay;
	}
	public int getHeight() {
		return HEIGHT;
		}
	public int getWidth() {
		return WIDTH;
		}
	public String getTitle() {
		return title;
	}
	
}
