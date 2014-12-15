import java.io.*;
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
		

		System.out.println("what is the magnetic variation for the flight? input an integer less than 360"); 
		String magVar=input.nextLine();	
		System.out.println("What is the direction of magnetic variation? (input east or west)");
		String magVarDir=input.nextLine();
		System.out.println("what is the wind direction for the flight?(input an integer less than 360)");
		String windDirection = input.nextLine();
		System.out.println("what is the wind speed for the flight?(to get a reasonable answer, input a reasonable windspeed between 0 and 60");
		String windSpeed= input.nextLine();
		input.close();
		
		for (Waypoint w : Waypoints) {
				w.calcTH(windSpeed, windDirection);  
			}
		
		
		for (Waypoint w : Waypoints) {
			w.calcMH(magVar, magVarDir);
			}
		
		for (Waypoint w : Waypoints){
			w.calcGS(windSpeed, windDirection);
		}
		
		for (Waypoint w: Waypoints){
			w.calcTime();
		}
		for (Waypoint w: Waypoints){
			w.calcfuelBurn();
		}

		
		PrintWriter output = new PrintWriter("src/navlog.txt");
		output.println("Waypoint" +" True Course" + "  Distance"+"  True Heading" + "  Ground Speed" + "  Time of Flight" + "   Fuel Burn");
		for (Waypoint w: Waypoints){
			output.println(w.waypoint +"        "+ w.trueCourse +"        "+ w.distance +"       "+ w.trueHeading +"       "+ w.groundSpeed +"            "+ w.time +"          "+ w.fuelBurn);
			}
		double totalDistance =0;
		double totalTime=0;
		double totalFuelBurn=0;
		double totalSpeed=0;
		int i=0;
		for (Waypoint w: Waypoints){
			totalDistance = totalDistance + w.distance;
			totalTime = totalTime + w.time;
			totalFuelBurn = totalFuelBurn + w.fuelBurn;
			totalSpeed= totalSpeed +w.groundSpeed;
			i++;
		}
		
		double averageSpeed = totalSpeed/i;
		totalTime = Math.round (totalTime*100.0)/100.0;
		totalFuelBurn = Math.round(totalFuelBurn*100.0)/100.0;
		averageSpeed = Math.round(averageSpeed*100.0)/100.0;
		output.println("Total distance =" + totalDistance +" NM. Total time=" + totalTime + " hours. Fuel burn = " + totalFuelBurn + " gal. Average ground speed= " + averageSpeed + "kts." );
		output.close();
		
		
	
		
	
	
	}
}
