package codes;

public class codes5 {
	int n;
	codes5(int x){
		n=x;
	}
	void factorial() {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial="+fact);
		
	}
	

	public static void main(String[] args) {
		codes5 obj=new codes5(4);
		obj.factorial();
		// TODO Auto-generated method stub

	}

}
