import java.io.*;
import java.util.*;
import java.util.regex.*;




public class FileInput {
	
	public static void main(String[] args) throws FileNotFoundException {

		Scanner fileReader = new Scanner(new File("src/input.txt")); 
		/*define variables we are summing up*/
		double checking = 0;
		double savings = 0;
		double creditCard = 0;
		
		do{
		String line = fileReader.nextLine();
		Scanner input = new Scanner (line);
		if (line.contains("Checking") && (line.contains("Opening Balance") || line.contains("Deposit"))) {
				while (input.hasNext() && !input.hasNextDouble()){	
					input.next();
				}
				checking += input.nextDouble(); 
				}
		else if (line.contains("Savings") && (line.contains("Opening Balance") || line.contains("Deposit"))){

				while (input.hasNext() && !input.hasNextDouble()){	
					input.next();
			}
				savings += input.nextDouble();
				}

		else if (line.contains ("Credit Card") &&(line.contains("Opening Balance") || line.contains("Deposit"))){

				while (input.hasNext() && !input.hasNextDouble()){	
					input.next();
					}
				creditCard += input.nextDouble();
				}
		else if (line.contains("Checking") && line.contains("Withdrawal")){

				while (input.hasNext() && !input.hasNextDouble()){	
					input.next();
					}
				checking -= input.nextDouble();
				}
		else if ((line.contains(("Savings")) && (line.contains("Withdrawal")))){

				while (input.hasNext() && !input.hasNextDouble()){	
					input.next();
					}
				savings -= input.nextDouble();
				}
		else if (line.contains("Credit Card") && line.contains("Withdrawal")){

				while (input.hasNext() && !input.hasNextDouble()){	
					input.next();
					}
				creditCard -= input.nextDouble();
				}
		
		}
				while (fileReader.hasNextLine());	
		
		fileReader.close();
		
		PrintStream output = new PrintStream(new File("src/output.txt"));
		output.println("Checking = $" + checking);
		output.println("Savings = $" + savings);
		output.println("Credit Card Balance = $" + creditCard);
		output.close();

	}
}

