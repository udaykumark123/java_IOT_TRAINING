package codes;

public class day32 {

	public static void main(String[] args) {
		System.out.println("helloworld!");
	
		try {
			System.out.println(10/0);
			int[] a= {10,20,30};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			
		}catch(ArithmeticException e) {
			System.out.println("array");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("System");		
		}catch(Exception e) {
			System.out.println("sys");
		}
		System.out.println("nijsd");
		// TODO Auto-generated method stub

	}

}
