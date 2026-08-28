package codes;
class parent{
	int a=3;
	int b=4;
	}

public class Codes9 extends parent{
	int a=20;
	int b=10;
	void add(int a, int b) {
		System.out.println(super.a+super.b);
		System.out.println(this.a+this.b);
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Codes9 tt=new Codes9();
		tt.add(2, 4);
		// TODO Auto-generated method stub

	}

}
