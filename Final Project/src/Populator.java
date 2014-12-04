import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//TODO create an arraylist of waypoint objects from which to calculate everything else. 

public class Populator {
	public void load(String filepath) throws FileNotFoundException{
		Scanner fileReader = new Scanner(new File (filepath));
		ArrayList <Waypoint> Waypoints = new ArrayList<Waypoint>();
		while (fileReader.hasNext()) {
			Waypoints.add (new Waypoint (fileReader.next(), fileReader.nextInt(), fileReader.nextDouble()));
		}
		fileReader.close();
		Scanner input= new Scanner(System.in);
		

		System.out.println("what is the magnetic variation for the flight? input an integer"); //TODO figure out how to get positive or negative input
		String magVar=input.nextLine();	
		System.out.println("What is the direction of magnetic variation? (input east or west)");
		String magVarDir=input.nextLine();
		System.out.println("what is the wind direction for the flight?");
		String windDirection = input.nextLine();
		System.out.println("what is the wind speed for the flight?");
		String windSpeed= input.nextLine();
		input.close();
		

		for (Waypoint w : Waypoints) {
			System.out.println(w.waypoint);
		}
		
		//TODO for each leg calculate trueCourse, trueHeading, magneticHeading, groundSpeed, fuelBurn, time, and put into arraylist
		//TODO print newly filled out Arraylist to file
	}
}
