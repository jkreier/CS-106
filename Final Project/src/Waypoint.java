
/**
 * this class builds the object that each waypoint will be made of
 * and contains the methods to calculate all of the variables
 * it contains the values for the name of the waypoint, the heading
 * and the distance to the next waypoint.
 * @author jake
 *
 */
import static java.lang.Math.*;

//defines the class and its variables
public class Waypoint {
	public String waypoint;
	public double trueCourse;
	public double distance;
	public double windCorrectionAngle;
	public double trueHeading;
	public double magneticHeading;
	public double groundSpeed;
	public double time;
	public double fuelBurn;
	
	//constructs the object:
	public Waypoint(String waypoint, double trueCourse, double distance){
		this.waypoint = waypoint;
		this.trueCourse = trueCourse;
		this.distance = distance;
		
		
		}
	/**Calculates true heading for this waypoint**/
	public void calcTH(String windSpeed, String windDirection){
		//first calculates wind correction angle
		double WS = Double.parseDouble(windSpeed);
		double WD = Double.parseDouble(windDirection);
		double X = Math.toRadians(WD-trueCourse);
		double Z= (Math.sin(X));
		double M = WS*Z;
		double D = M/98;
		double WCA = Math.asin(D);
		WCA = Math.toDegrees(WCA);
		windCorrectionAngle = Math.round(WCA*100.0)/100.0;
		trueHeading = Math.round(trueCourse + WCA*100.0)/100.0;
		if (trueHeading < 0){
			trueHeading = 360 - trueHeading;
		}
		
		
		//TODO get WCA to calculate properly, something to do with radians
	}
		/**calculates magnetic heading for this waypoint**/
	public void calcMH (String magVar, String magVarDir){
		double MV= Double.parseDouble(magVar);
		if (magVarDir.equals("east")){ //if magnetic variation is east, subtract magnetic variation, if it is west, add it
			magneticHeading = Math.round((trueHeading - MV)*100.0)/100.0;
			
						
		}
		else{
			magneticHeading = Math.round((trueHeading+MV)*100.0)/100.0;
		}
		
		if(magneticHeading < 0){
			magneticHeading = Math.round((360 + magneticHeading)*100.0)/100.0; //there is no such thing as a negative compass heading, so if it is negative it gets added to 360 to give the heading
		}
		
	}
	/**calculates groundspeed for this waypoint**/
	public void calcGS(String windSpeed, String windDirection){
		double WS = Double.parseDouble(windSpeed);
		double WD = Double.parseDouble(windDirection);
		groundSpeed = Math.sqrt(  pow(98, 2) + pow(WS,2) -2*98*Math.cos(trueCourse - WD + windCorrectionAngle) );
		groundSpeed = Math.round(groundSpeed*100.0)/100.0;
		
	}
	/**calculates time for this waypoint**/	
	public void calcTime(){
		time = distance/groundSpeed;
		time = Math.round(time*100.0)/100.0;
	}
	/**calculates fuel burn for this waypoint, assumes a fuel burn of 8.8 GPH typical of single engine airplanes like a cessna 172 or piper cherokee**/
	public void calcfuelBurn(){
		fuelBurn = time*8.8;
		fuelBurn= Math.round(fuelBurn*100.0)/100.0;
	}
	
		
	
	
	
}


