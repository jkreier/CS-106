/**
 * ArrayCreator makes the array of Waypoint objects and gives them values
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ArrayCreator {
	public void load(String filepath) throws FileNotFoundException  {//TODO figure out how to pass the file name from the main class
	Scanner fileReader = new Scanner(filepath);
	int numLines = numLines(filepath); //does this recognize that I'm trying to call a new method?
	Waypoint[] Waypoint = new Waypoint[numLines];//defines the Waypoint object-array and gives it the number of waypoints.
	
	
	
	
		
		
	}
	
	
	
	
	
	public int numLines(String filepath) throws FileNotFoundException{	
	Scanner fileReader = new Scanner(new File(filepath)); 
	int numberofLines = 0;
		while (fileReader.hasNextLine()){
			numberofLines ++;
			fileReader.nextLine();
			}
	fileReader.close();
	return numberofLines;
	}
}