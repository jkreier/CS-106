import java.io.*;
import java.util.*;

/** 
 * a program to calculate the total distance of a flight given an input in the form of a flight 
 * plan. will also calculate the average heading of the plane.
 * @author jake
 *
 */

public class PilotComputer {

	public static void main(String[] args) throws FileNotFoundException {
		// calls class to calculate number of lines in file
		LineSum sum = new LineSum();
		int numLines= sum.numLines("src/flightplan.txt");
		System.out.println(numLines);
		// call a class that creates the arrays and takes all the data from the file
		// call a class that sums the distances
		// call a class that averages the headings
	}
}
