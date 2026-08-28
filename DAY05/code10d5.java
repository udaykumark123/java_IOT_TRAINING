package praticeday5iot;
import java.util.HashSet;
import java.util.Iterator;

public class code10d5 {

		    public static void main(String[] args) {

		        HashSet<Integer> numbers = new HashSet<>();

		        numbers.add(10);
		        numbers.add(10);
		        numbers.add(8);
		        numbers.add(8);
		        numbers.add(6);
		        numbers.add(6);
		        numbers.add(11);
		        numbers.add(11);

		        System.out.println("Using enhanced for loop:");

		        for (int number : numbers) {
		            System.out.println(number);
		        }

		        System.out.println("Using iterator:");

		        Iterator<Integer> iterator = numbers.iterator();

		        while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        }
		    }
		
		// TODO Auto-generated method stub

	}


