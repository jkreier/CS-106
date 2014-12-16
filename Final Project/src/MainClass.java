import java.io.*;
import java.util.*;

/** 
 * a program to calculate the total distance of a flight given an input in the form of a flight 
 * plan. Main method calls ArrayCreator to make an array of Waypoint objects. Feel free to plan your own
 * flight  at www.skyvector.com, and then copy the waypoints, true headings, and distances for each waypoint into
 * a properly formatted file to create your own flight plan.
 * @author jake
 *
 */

public class MainClass {
	public static void main(String[] args) throws FileNotFoundException{
	Populator FlightPlan = new Populator();
	FlightPlan.load("src/flightplan.txt");
	
	//TODOprint the new flightplan to a new file
	//TODO determine possibility of making flight without stopping
	//TODO calculate optimal altitude of flight (figure out equation for this?)
	}
}
