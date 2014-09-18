import java.util.Scanner;
// here is an improved version of project 1 which asks users for input in order to make its calculations. above live imports scanner from SDK.

public class calculatorwithinput {
	
		public static void main(String[] args) {
		//these three scanner iterations ask for the necessary info to complete the calculations
			Scanner loanInput = new Scanner(System.in);
			System.out.print("input loan amount");
			double loan = loanInput.nextDouble();
		
			System.out.print("input interest percentage");
			double interest= loanInput.nextDouble();
			System.out.print("input number of payments");
			double payments=loanInput.nextDouble();

			double loanTotal = calculator(loan, interest, payments);// this parameter sends info to the "calculator" method.
			System.out.println(loanTotal); //this receives the result of the "calcualtor" method and prints it
			if (loanTotal > 2*loan){
				System.out.println("this loan is not worth it.");
			}
		}
		public static double calculator(double principal, double interest, double numberofPayments){// the method is declared a double, not a void
																									// usually empty parenthases receive information from first method
			double interestdecimal= interest / 100; //this converts the interest percentage to decimals
			double interestamount = principal * interestdecimal;
			double loanTotal= ((interestamount * numberofPayments)+principal);
			return loanTotal; //"return" sends result of calculation back to first method.
		}
}
