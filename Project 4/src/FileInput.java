import java.io.*;
import java.util.*;
import java.util.regex.*;




public class FileInput {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner fileReader = new Scanner(new File("src/input.txt")); 
		/*define variables we are summing up*/
		double checking = 0;
		double savings = 0;
		double creditCard = 0;
		
		do{
		String line = fileReader.nextLine;	
		if (line.contains("Checking") && ((line.contains("Opening Balance") || line.contains("Deposit"))));
				checking += fileReader.nextDouble; 
		else if (line.contains("Savings") && ((line.contains("Opening Balance") || line.contains("Deposit"))));
				savings += fileReader.nextDouble;
		else if (line.contains ("Credit Card") &&((line.contains("Opening Balance") || (line.contains("Deposit"))));
				creditCard += fileReader.nextDouble;
		else if (line.contains("Checking") && line.contains("Withdrawl"))
				checking -= fileReader.nextDouble();
		else if (line.contains(("Savings") && line.contains("Withdrawl"));
				savings -= fileReader.nextDouble();
		else if (line.contains("Credit Card") && line.contains("Withdrawl"));
				creditCard -= fileReader.nextDouble;
			
		
		}
				while (fileReader.hasnextLine);		
		
		System.out.println("Checking = $" + checking);
		System.out.println("Savings = $" + savings);
		System.out.println("Credit Card Balance = $" + creditCard);
		
		
		/*create line of code to write results to a new file*/
		fileReader.close();
	}
