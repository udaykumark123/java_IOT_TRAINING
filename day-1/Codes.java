package codes;

public class Codes {
	int a,b;
	//constructor
	Codes(int x,int y){
		a=x;
		b=y;
	}
	void add() {
		System.out.println("Addition="+(a+b));
		
	}
	public static void main(String[] args) {
		Codes obj =new Codes(10,20);
		obj.add();
	}

}
