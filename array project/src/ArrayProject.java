import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ArrayProject {

	public static void main(String[] args) throws FileNotFoundException {		
		Scanner fileReader = new Scanner(new File("src/input.txt")); 
		int numberofLines = 0;
			while (fileReader.hasNextLine()){
				numberofLines ++;
				fileReader.nextLine();
			}
		System.out.println(numberofLines);

		
		String[] dates= new String[numberofLines];
		String[] accounts = new String[numberofLines];
		String[] transactions = new String[numberofLines];
		double[] amounts = new double [numberofLines];
		
		int positionVariable = 0;
		
		while (fileReader.hasNextLine()){

			dates[positionVariable] = fileReader.next();
			accounts[positionVariable] = fileReader.next();
				if (accounts[positionVariable].equals("Credit")) {
					accounts[positionVariable] = "Credit"+ fileReader.next();
					}
			transactions[positionVariable] = fileReader.next();
				if (transactions[positionVariable].equals("Opening")) {
				transactions[positionVariable] = "Opening" + fileReader.next();
				}
		amounts[positionVariable]=fileReader.nextDouble();
		positionVariable ++;
		 }

		double checking = 0;
		double savings = 0;
		double creditCard= 0;
		
		
		
		
		
		/*String[] dates = newString[/*TODO figure out how many lines are in the file*/
	}	
}

