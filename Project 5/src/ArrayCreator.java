/**
 * ArrayCreator makes the array of Waypoint objects and gives them values
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ArrayCreator {
	public void load(String filepath) throws FileNotFoundException  {
		File file = new File (filepath);
		
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