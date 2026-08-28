package praticeaday5iot;

import java.util.HashSet;

public class code8d5 {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		System.out.println("Initial size of HashSet before adding elements:"+set.size());
		System.out.println("HashSet is  empty before adding values:"+set.isEmpty());
		System.out.println("Contents of HAshset before adding values:"+set);
		set.add("C");
		set.add("B");
		set.add("U");
		set.add("J");
		set.add("O");
		set.add(null);
		System.out.println("size of HashSet after adding elements:"+set.size());
		System.out.println("hashset is empty after adding values:"+set.isEmpty());
		System.out.println("Contents of HAshset after adding values:"+set);
		boolean b1=set.contains("E");
		System.out.println("value E is present:"+b1);
		boolean b2=set.contains("A");
		System.out.println("value A is present:"+b2);
		set.remove("B");
		System.out.println("size of HashSet after deletion elements:"+set.size());
		System.out.println("Contents of HAshset after deletion values:"+set);
		set.clear();
		System.out.println("size of HashSet after clearing elements:"+set.size());
		System.out.println("Contents of HAshset after clearing values:"+set);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
