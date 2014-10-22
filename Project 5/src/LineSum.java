import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LineSum {
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
