package codes;

public class Codes8 { 
	int n;
	Codes8(int x){
		n=x;
	}
	void fibonacci() {
		int a=0,b=1;
		System.out.println("Fibonnaci series:");
		for(int i=1;i<=n;i++) {
			System.out.println(a + " ");
			int c=a+b;
			a=b;
			b=c;
			
		}
	}


	public static void main(String[] args) {
		Codes8 obj=new Codes8(10);
		obj.fibonacci();
		// TODO Auto-generated method stub

	}

}
