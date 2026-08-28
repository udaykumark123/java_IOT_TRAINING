package praticeday7iot;

public class ptday71 {
	static void methodA() {
		System.out.println("inside methodA");
		methodB();
		System.out.println("Back to MethodA");
		
		
	}
	static void methodB() {
		System.out.println("inside methodB");
		
	}

	public static void main(String[] args) {
		System.out.println("Inside main");
		methodA();
		System.out.println("Back to main");
		
		// TODO Auto-generated method stub

	}

}
