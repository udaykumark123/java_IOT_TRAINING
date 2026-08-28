package day3;
import java.util.ArrayList;
import java.util.Set;
public class arrayset {

	public static void main(String[] args) {
		int[] numbers= {10,20,40,50,60};
		
		ArrayList<Integer> set=new ArrayList<>();
		for(int num:numbers) {
			set.add(num);
		}
		int target=20;
		if(set.contains(target)) {
			System.out.println("number found");
		}else {
			System.out.println("number not found");
		}
		
	}

}
