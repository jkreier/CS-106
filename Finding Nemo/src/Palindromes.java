
import java.util.*;
public class Palindromes {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please indicate the number of lines that will be inputed");
		int i = 0;
		i = input.nextInt();
		String [] palindrome = new String[i];
		int x = 0;
			while (x < i){
				
				System.out.println("Input your next line");
				palindrome[x] = input.next();
				x++;
			}
		int n = 0;
			while (n < i){
				if (palindrome[n].equalsIgnoreCase(new StringBuilder(palindrome[n]).reverse().toString())){
					System.out.println("is a palindrome");
				}else{
					System.out.println("not a palindrome");
					}	
				n++; 
		}
		
		
		
		
		
		/*int n = 0;
		String thing;
		while (n < i){
			System.out.println("Please input your line");
			thing = input.next();
			if (thing.equalsIgnoreCase(new StringBuilder(thing).reverse().toString())){
			System.out.println("Is a palindrome");
			}
			else {
			System.out.println("not a palindrome");
			}
			n++;
		}*/
	}		

	}


