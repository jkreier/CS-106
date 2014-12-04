
public class RecursionTest {

	public static void main(String[] args) {
		second(10, 1);

	}
	
	public static void second (int number, int current){
		current --;
		if (current<number){
			current ++;
			System.out.println(current);
			second(number, current);
		}
	}

}
