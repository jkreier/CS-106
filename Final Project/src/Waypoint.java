
/**
 * this class builds the object that each waypoint will be made of.
 * it contains the values for the name of the waypoint, the heading
 * and the distance to the next waypoint.
 * @author jake
 *
 */
//defines the class and it's variables
public class Waypoint {
	public String waypoint;
	public int course;
	public double distance;
	public int trueHeading;
	public int magneticHeading;
	public double groundSpeed;
	public double time;
	public double fuelBurn;
	
	//constructs the object:
	public Waypoint(String waypoint, int course, double distance, int trueHeading, int magneticHeading, double groundSpeed, double time, double fuelBurn){
		this.waypoint = waypoint;
		this.course = course;
		this.distance = distance;
		this.trueHeading = trueHeading;
		this.magneticHeading = magneticHeading;
		this.groundSpeed = groundSpeed;
		this.time = time;
		this.fuelBurn = fuelBurn;
		
		
		}
	public 
}
