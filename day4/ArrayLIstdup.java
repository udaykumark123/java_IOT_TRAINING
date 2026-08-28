package array;
import java.util.ArrayList;


public class ArrayLIstdup {

	public static void main(String[] args) {
		ArrayList list=new ArrayList<>();
		System.out.print("\ninitial size of arrayList:"+list.size());
		System.out.println("\nArrayList is empty befor ADding values:"+list.isEmpty());
		System.out.println("\nContents of ARrayList before adding values:"+list);
		list.add("A");
		list.add("B");
		list.add("B");
		list.add("A");
		boolean b1=list.contains("E");
		System.out.print("\n value of "+list.size());
		System.out.print("\nafter adding list size of arrayList:"+list.size());
		list.remove("B");
		System.out.print("\nafter remove list size of arrayList:"+list.size());
        list.clear();
        System.out.print("\nafter clear:"+list.size());
        System.out.print("\ninitial size of arrayList:"+list);
	}

}
