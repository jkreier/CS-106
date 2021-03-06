import java.io.*;
import java.util.*;
import java.util.regex.*;

/* This program takes financial information input from a properly formated file 
 * containing a list of transactions affecting checking, savings, and credit card transactions
 * and calculates the total balance of these accounts.
 * 
 * 
 */


public class FileInput {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		/*the main method does everything*/
 
		Scanner fileReader = new Scanner(new File("src/input.txt")); 
		/*define variables we are summing up below*/
		double checking = 0;
		double savings = 0;
		double creditCard = 0;
		/*following tract of code reads in the whole line of each transaction and then sorts out what account it is
		 * and whether to add or subtract value from the account*/
		do{
		String line = fileReader.nextLine(); /*declares "line" as the next line in the file */
		Scanner input = new Scanner (line);
		if (line.contains("Checking") && (line.contains("Opening Balance") || line.contains("Deposit"))) {
			/* determines if checking gets value added*/
				while (input.hasNext() && !input.hasNextDouble()){	/*moves input cursor until it finds the amount of value to be added*/
					input.next();
				}
				checking += input.nextDouble(); /*adds value*/
				}
		else if (line.contains("Savings") && (line.contains("Opening Balance") || line.contains("Deposit"))){
			/*same process at work for all the else if statements*/

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
		input.close();
		}
				while (fileReader.hasNextLine());	
		/*this while statement tests if there is another line
		*/
		
		fileReader.close();
		/*following line of code sends resulting values of each account to file called output.txt*/
		PrintStream output = new PrintStream(new File("src/output.txt"));
		output.println("Checking = $" + checking);
		output.println("Savings = $" + savings);
		output.println("Credit Card Balance = $" + creditCard);
		output.close();

	}
}

