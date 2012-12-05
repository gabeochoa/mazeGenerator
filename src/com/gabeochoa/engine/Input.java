package com.gabeochoa.engine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Input implements KeyListener, MouseListener, MouseMotionListener {

	public int[] mouse = new int[5];
	public boolean[] keys = new boolean[10];
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		 mouse[3] = arg0.getX();
	     mouse[4] = arg0.getY();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		mouse[0] = arg0.getButton();
        mouse[1] = arg0.getX();
        mouse[2] = arg0.getY();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		mouse[0] = 0;//arg0.getButton();
        mouse[1] = 0;//arg0.getX();
        mouse[2] = 0;//arg0.getY();
	}

	@Override
	public void keyPressed(KeyEvent k) {
		int kc = k.getKeyCode();
		if( kc > 0 && kc < keys.length)
			keys[kc] = true;
	}

	@Override
	public void keyReleased(KeyEvent k) {
		int kc = k.getKeyCode();
		if( kc > 0 && kc < keys.length)
			keys[kc] = false;
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}
