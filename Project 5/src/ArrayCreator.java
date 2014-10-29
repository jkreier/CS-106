/**
 * ArrayCreator makes the array of Waypoint objects and gives them values
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ArrayCreator {
	public void load(String filepath) throws FileNotFoundException  {
		Scanner fileReader = new Scanner(filepath);
		int numLines = numLines(filepath); //does this recognize that I'm trying to call a new method?
		Waypoint[] waypoints = new Waypoint[numLines];//defines the Waypoint object-array and gives it the number of waypoints.
		int i = 0;
		while (i < numLines){
			waypoints [i] = new Waypoint( fileReader.next() , fileReader.nextInt(), fileReader.nextDouble()); //populate the array
			i++; 
			}
		//TODO take array and add the last double of each iteration to 
		/*double totalDistance = 0;
		int n = 0;
		while (n < numLines){
		totalDistance += waypoints[n].nextDouble; 
		}*/
		// do I need to return totalDistance to the main class or can I print out the totalDistance in ArrayCreator?
		System.out.println("sample line" + waypoints[2]);
		
		
	
	
		
		
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