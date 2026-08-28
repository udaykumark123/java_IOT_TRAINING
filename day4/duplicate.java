package day3;
import java.util.HashSet;

public class duplicate {

	public static void main(String[] args) {
		int[] numbers= {10,20,20,50,10};
		
		HashSet<Integer> set=new HashSet<>();
		for(int number:numbers) {
		if(set.contains(number)) {
			System.out.println("duplicate:"+number);
		}else {
			set.add(number);
		}
		
		}
	}
}
		
	




