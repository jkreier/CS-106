import java.util.Scanner;
/** this program asks the user questions about various ideas in political philsoophy and determines which political philosopher
* they most closely resemble.
*
* @author jake
*
*/
		public class Whatpoliticalphilosopherareyou {
				//the following method asks the user questions and determines their score for the various philosophers.
			public static void main(String[] args) {
				int hobbes = 0;
				int rousseau = 0;
				int nietzsche = 0;
				int marx = 0;
				int plato = 0;
			Scanner question = new Scanner(System.in);
			System.out.println("Do you think people are nothing more than intelligent animals? (answer yes or no)");
			String animal = question.nextLine();
			if (animal.equals("yes")){	//this part adds points to the different philosophers
				hobbes +=3;
				marx +=3;
				nietzsche +=2;
				rousseau -=1;
				plato -=3;
			}
			else if (animal.equals("no")){
				hobbes -=3;
				marx -=3;
				nietzsche -=2;
				rousseau +=1;
				plato +=3; }
			System.out.println("Do you think inequality among people is natural? (answer yes or no)");
			String inequality = question.nextLine();
			if (inequality.equals ("yes")){
				hobbes +=1;
				marx -=3;
				nietzsche +=3;
				rousseau -=2;
				plato +=2;
			}
			else if (inequality.equals ("no")){
				hobbes -=1;
				marx +=3;
				nietzsche -=3;
				rousseau +=2;
				plato -=2;
			}
			System.out.println("Do you think (A)the individual is more important than society, or (B)society is more important than the individual?");
			String individual = question.nextLine();
			if (individual.equals("A")){
				hobbes +=3;
				marx +=2;
				nietzsche -=3;
			}
			else if(individual.equals("B")){
				hobbes -=3;
				marx -=2;
				nietzsche +=3;
			}
			System.out.println("Do you think society is capable of improvement? (answer yes or no)");
			String progress = question.nextLine();
			if (progress.equals("yes")){
				marx +=3;
				nietzsche -=2;
				rousseau +=2;
				plato -=3;
			}
			else if (individual.equals("no")){
				marx -=3;
				nietzsche +=2;
				rousseau -=2;
				plato -=3;
			}
			philosopherDeterminer(hobbes, marx, nietzsche, rousseau, plato);//calls next method and sends information to it
}

			/*this method will determine which philosopher has gotten the greatest score and print out which philosopher the person is
			 * most like depending on which philosopher got the highest score.
			 */
			public static void philosopherDeterminer(int hobbes, int marx, int nietzsche, int rousseau, int plato){
				if (hobbes<marx && hobbes<nietzsche && hobbes<rousseau && hobbes<plato){ //statement compares values of each variable to find if hobbes is the greatest
					System.out.println("You are Hobbes");
				}
				else if (marx<hobbes && marx<nietzsche && marx<rousseau && marx<plato){
					System.out.println("You are Marx");
				}
				else if (nietzsche<hobbes && nietzsche<rousseau && nietzsche<plato){
					System.out.println("You are Nietzsche");
				}
				else if (rousseau<hobbes && rousseau<marx && rousseau<nietzsche && rousseau<plato){
					System.out.println("You are Rousseau");
				}
				else if (plato<hobbes && plato<marx && plato<nietzsche && plato<rousseau)
					System.out.println("You are Plato");
			}
}
