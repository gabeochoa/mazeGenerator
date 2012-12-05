package com.gabeochoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadMaze {

	public static boolean[][] maze = new boolean[50][50];

	public static void main(String[] args) throws Exception {

		ArrayList<String> mazeLines = null;
		try {
			 mazeLines = getArrayListFromFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String[] line = new String[50];
				
		for(int i=0; i<maze.length; i++)
		{
		   for(int j=0; j< maze[i].length; j++)
			{
			    
			    
				if(mazeLines.get(j).substring(i, i+1).equals("0"))				
				maze[i][j] = false; 
				
				if(mazeLines.get(j).substring(i, i+1).equals("1"))				
				maze[i][j] = true; 
			}
		}
	}

	public static boolean[][] getMaze()
	{
		ArrayList<String> mazeLines = null;
		try {
			 mazeLines = getArrayListFromFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String[] line = new String[50];
				
		for(int i=0; i<maze.length; i++)
		{
		   for(int j=0; j< maze[i].length; j++)
			{
				if(mazeLines.get(j).substring(i, i+1).equals("0"))				
				maze[i][j] = false; 
				
				if(mazeLines.get(j).substring(i, i+1).equals("1"))				
				maze[i][j] = true; 
			}
		}
		return maze;
	}

	private static ArrayList getArrayListFromFile() throws FileNotFoundException {
		
		File file = null;
		file = getFile("maze.txt");
		ArrayList mazeLines = new ArrayList();
		
		Scanner input = new Scanner(file);	

		while(input.hasNextLine()) {

			try{
				String line = input.nextLine();
				mazeLines.add(line);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		input.close();
		
		return mazeLines;
	}


	private static File getFile(String string) {

		File inFile = null;
		boolean goodFile = false; 

		while(!goodFile) {

			String inFileName = string;
			inFile = new File(inFileName);

			if(!inFile.exists()) {
				System.out.println("\nThat file does not exist or is in a " +
						"different directory");
				return null;
			} else {
				goodFile = true;
			}
		}
		return inFile;
	}

	@SuppressWarnings("unused")
	private static File getFileWithInput() {

		System.out.println("Please give the name of the input file");
		Scanner kbd = new Scanner(System.in);
		File inFile = null;
		boolean goodFile = false; 
		while(!goodFile) {
			String inFileName = kbd.nextLine();
			inFile = new File(inFileName);
			//SEE THE NOTE ABOUT THE FILE AT THE END OF THE PAGE
			if(!inFile.exists()) {
				System.out.println("\nThat file does not exist or is in a " +
						"different directory");
				System.out.println("Please give the name of the input file");
			} else {
				goodFile = true;
			}
		}
		return inFile;
	}

}
