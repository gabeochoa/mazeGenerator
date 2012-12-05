package com.gabeochoa;

import java.util.Scanner;

public class syll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String input = "";
		
		Scanner s = new Scanner(System.in);
		
		
		while(!s.next().equalsIgnoreCase("quit"))
		{
			input = s.next();
			
			System.out.println(count(input));
		}
	}
	
	public static int count(String inpu)
	{
		
		
		
		return 0;
	}

}
