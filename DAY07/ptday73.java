package praticedayiot7;

public class ptday73 {
	static void count(int n) {
		if(n==0) {
			return;
		}
		System.out.println("Calling count("+n+")");
		count(n-1);
		System.out.println("REturnig from count("+n+")");
	}

	public static void main(String[] args) {
		System.out.println("calling count for main");
		count(5);
		System.out.println("exit for count method");
		// 

	
	}

}
