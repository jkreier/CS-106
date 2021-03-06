
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
	public int heading;
	public double distance;
	//constructs the object:
	public Waypoint(String waypoint, int heading, double distance){
		this.waypoint = waypoint;
		this.heading = heading;
		this.distance = distance;
	}
}
