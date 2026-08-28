package praticeaday5iot;
import java.util.ArrayList;
import java.util.Iterator;
public class code9d5 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(10);
		numbers.add(8);
		numbers.add(8);
		numbers.add(6);
		numbers.add(6);
		numbers.add(11);
		numbers.add(11);
		System.out.println("using enhanced for loop:");
		for(int number:numbers) {
			System.out.println(number);
			
		}
		System.out.println("Using iterator:");
		Iterator<Integer>iterator=numbers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// TODO Auto-generated method stub

	}

}
