
public class loancalculator {
public static void main(String[] args) {
// TODO Auto-generated method stub
/*this program calculates the total amount of money
* it will cost you to repay a loan. You must input the initial
* value of the loan, the interest rate,
* and the number of payment periods there will be for the loan.
*/
double loan = 10000000;
double interestrate = 1; // this is the interest rate percentage
int paymentnumber = 12;
double interestdecimal= interestrate / 100; //this converts the interest percentage to decimals
double interestamount = loan * interestdecimal;
System.out.println("your periodic payments on the loan will be:");
System.out.print("$");
System.out.println(interestamount);
System.out.println();
System.out.println("your total cost to repay the loan will be:");
System.out.print("$");
System.out.println((interestamount * paymentnumber)+loan);	
double totalcost= ((interestamount * paymentnumber)+loan);
System.out.println();
System.out.print("this loan will cost you ");
System.out.print(totalcost / loan);
System.out.println(" times the original value of the loan.");
System.out.println();
if (totalcost > 2*loan){
System.out.println("this loan is not worth it.");
}
newMethod();
}
public static void newMethod() {
System.out.println("here is a new method");
}
}