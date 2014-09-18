import java.util.Scanner;


public class calculatorwithinput {
	
		public static void main(String[] args) {
		
			Scanner loanInput = new Scanner(System.in);
			System.out.print("input loan amount");
			double loan = loanInput.nextDouble();
		
			
			
			System.out.print("input interest percentage");
			double interest= loanInput.nextDouble();
			System.out.print("input number of payments");
			double payments=loanInput.nextDouble();

			double loanTotal = calculator(loan, interest, payments);
			System.out.println(loanTotal);
			if (loanTotal > 2*loan){
				System.out.println("this loan is not worth it.");
			}
		}
		public static double calculator(double principal, double interest, double numberofPayments){
	
			double interestdecimal= interest / 100; //this converts the interest percentage to decimals
			double interestamount = principal * interestdecimal;
			double loanTotal= ((interestamount * numberofPayments)+principal);
			return loanTotal;
		}
}