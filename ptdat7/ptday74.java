package praticedayiot7;

public class ptday74 {
	static void count(int n) {
		if(n==0) {
			System.out.println("Calling count("+n+")");
			return;
			
		}else {
			System.out.println("Calling count("+n+")");
			count(n-2000);
		
			
		}
		
	}

	public static void main(String[] args) {
		count(10000);
		// 

	
	}

}
