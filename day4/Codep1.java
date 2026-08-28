package day3;
import java.util.Vector;


public class Codep1 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		//Vector vector new Vector(5);
		//Vector vector =new Vector(5,3);
		vector.add("A");
		vector.add("A");
		vector.add("A");
		System.out.println("No of the elements in the vector:"+vector.size());
		System.out.println("capacity of  the vector:"+vector.capacity());
		System.out.println("Values stored in vector:"+vector);
		vector.trimToSize();
		System.out.println("AFter traimming.....");
		System.out.println("No of the elements in the vector:"+vector.size());
		System.out.println("capacity of  the vector:"+vector.capacity());
		System.out.println("Values stored in vector:"+vector);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
