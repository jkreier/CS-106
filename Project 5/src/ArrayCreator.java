/**
 * ArrayCreator makes the array of Waypoint objects,
 * gives them values, then sums the total distance and
 * prints the total distance of the flight plan.
 * @param filepath 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ArrayCreator {
	 public void load(String filepath) throws FileNotFoundException  { //load method receives filepath from main method, creates array of waypoint objects, and populates the array. 
		Scanner fileReader = new Scanner(new File (filepath));
		int numLines = numLines(filepath); 
		Waypoint[] waypoints = new Waypoint[numLines];
		int i = 0;
		while (i < numLines){
			waypoints [i] = new Waypoint( fileReader.next() , fileReader.nextInt(), fileReader.nextDouble()); //populates the array
			i++; 
			}
		double totalDistance = 0; // defines totalDistance variable and adds all the distances from the array.
		for (Waypoint w : waypoints){
		totalDistance += w.distance; 
		}
		
		System.out.println("total distance for the flight is " + totalDistance + " nautical miles");
		
	
		//below I have commented out a line of code that I wanted to have print "the total distance from (name of first waypoint) to (name of last waypoint) is x miles, but I couldn't get it to work.
		/* System.out.println("total distance for the flight from " + waypoints[0].waypoint + "to" + waypoints[i].waypoint + "is" + totalDistance + " nautical miles");	*/
	
	
		
		
	}
	
	
	
	/**
	 * numLines method adds the number of lines in the input file to allow main method to determine how many lines will be in the array
	 * @param filepath
	 * @return
	 * @throws FileNotFoundException
	 */
	
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