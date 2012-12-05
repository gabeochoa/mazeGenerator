package com.gabeochoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class mazeGenerator{

	private static String[] mazeLine = 
		{
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000",
		"00000000000000000000000000000000000000000000000000"
		};

	public static void main(String[] args) throws Exception {
		
		generator();		
		saveFile();
	}

	private static void generator() {
		
		
		
		
		
	}

	private static void saveFile()
	{

		FileOutputStream outfile;
		try {

			outfile = new FileOutputStream("maze.txt", false);
			PrintWriter output = new PrintWriter(outfile);

			for(String str: mazeLine)
			{
				output.println(str);
			}

			output.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}