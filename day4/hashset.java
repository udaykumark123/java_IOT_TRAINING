package day3;
import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 40;
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) 
        	set.add(num);
        System.out.println(set.contains(target) ? "Number found" : "Number not found");
    }
}

