package codes;

public class Codes3 {
	int a, b;
	Codes3(int x,int y){
		a=x;
		b=y;
	}
	void div(){
		System.out.println("div="+(a/b));
		
	}
	

	public static void main(String[] args) {
		Codes3 obj=new Codes3(10,5);
		obj.div();
		// TODO Auto-generated method stub

	}

}
