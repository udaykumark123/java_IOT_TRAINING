package codes;

public class Codes4 {int a,b;
//constructor
Codes4(int x,int y){
	a=x;
	b=y;
}
void sub() {
	System.out.println("sub="+(a-b));
	
}

	public static void main(String[] args) {
		Codes4 obj=new Codes4(10,5);
	    obj.sub();
		// TODO Auto-generated method stub

	}

}
