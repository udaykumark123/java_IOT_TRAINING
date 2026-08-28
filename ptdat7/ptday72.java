package praticedayiot7;

public class ptday72 {
	static void count(int n) {
		if(n==0) {
			return;
		}
		System.out.println("Calling count("+n+")");
		count(n-1);
		System.out.println("REturnig from count("+n+")");
	}

	public static void main(String[] args) {
		count(5);
		// TODO Auto-generated method stub

	}

}
