package codes;

public class Codes2 {
	int a, b;
	Codes2(int x,int y){
		a=x;
		b=y;
	}
	void multi(){
		System.out.println("multi="+(a*b));
		
	}
	

	public static void main(String[] args) {
		Codes2 obj=new Codes2(5,6);
		obj.multi();
		// TODO Auto-generated method stub

	}

}
