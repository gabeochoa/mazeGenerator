package com.gabeochoa.engine;

public class Loop extends Thread{

	private Game game;
	private Canvas canvas;

	public Long sTime, eTime;
	public int fps, updates;
	
	public Loop(Game game, Canvas canvas)
	{
		this.game = game;
		this.canvas = canvas;	
	}
	
	public void run()
	{
		game.init();
		sTime = System.currentTimeMillis();
		
		while(!game.isOver())
		{

			game.update();
			canvas.repaint();
			
			try {
				Thread.sleep(game.getDelay());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			eTime = System.currentTimeMillis() - sTime;
			
			if(updates > 120)
			{
				eTime = (long) 2000;
			}
			
			if( (eTime/1000) >= 1 )
			{
				
				updates /= (eTime/1000);
				
				sTime = System.currentTimeMillis();
				System.out.println(""+updates+" fps");
			}
			else{
					updates++;
				}
			
		}
		
	}
}
