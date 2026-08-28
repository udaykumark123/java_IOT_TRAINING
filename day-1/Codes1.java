package codes;

public class Codes1 {
	int a,b;
	Codes1(int x,int y){
		a=x;
		b=y;
		
	}
	void Sub() {
		System.out.println("Sub="+(a-b));
		
	}
	public static void main(String[] args) {
		Codes1 obj=new Codes1(10,20);
		obj.Sub();
	}

}
