
/**
 * this class builds the object that each waypoint will be made of.
 * it contains the values for the name of the waypoint, the heading
 * and the distance to the next waypoint.
 * @author jake
 *
 */
//defines the class and its variables
public class Waypoint {
	public String waypoint;
	public int trueCourse;
	public double distance;
	public int trueHeading;
	public int magneticHeading;
	public double groundSpeed;
	public double time;
	public double fuelBurn;
	
	//constructs the object:
	public Waypoint(String waypoint, int trueCourse, double distance){
		this.waypoint = waypoint;
		this.trueCourse = trueCourse;
		this.distance = distance;
		
		
		}
	/**Calculates true heading**/
	public void calcTH(String magVar, String MagVarDir){
		
		//TODO does formula Sin inverse of (wind speed times sin(wind direction - course)) all divided by 98 (true airspeed)
		//TODO adds value for WCA to value for trueCourse to give new value for trueHeading
	}
	//public void 
	
		
	
	
	//TODO create math methods
}

	//TODO print to new file
