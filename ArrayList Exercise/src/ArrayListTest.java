import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		
		System.out.println("ArrayList!");
		
		ArrayList<Integer> thing = new ArrayList<Integer>();
		thing.add(1);
		thing.add(2);
		thing.add(34);
		thing.add(23);
		thing.remove(0);
		System.out.println("foreach printing");
		for (int number : thing){
			System.out.println(number);
			}
		System.out.println(thing.get(0));
		System.out.println("Iterator Printing:");
		Iterator<Integer> itr1 = thing.iterator();
		while (itr1.hasNext()){
			int y = itr1.next();
			System.out.println(y);
			}
		
		System.out.println("Linked List!");
		
		LinkedList<Integer> otherThing = new LinkedList<Integer>();
		otherThing.add(1);
		otherThing.add(12);
		otherThing.add(14);
		otherThing.add(21);
		otherThing.add(51);
		otherThing.add(7);
		System.out.println("Foreach Printing:");
		for (int i : otherThing){
			System.out.println(i);
		}
		
		System.out.println("Iterator Printing:");
		Iterator<Integer> itr2 = otherThing.iterator();
		while (itr2.hasNext()){
			int x = itr2.next();
			System.out.println(x);
			}
	}

}
