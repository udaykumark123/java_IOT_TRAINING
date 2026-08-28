package codes;

public class Codes12 {
	int a;
	int b;
	void m1(int a,int b) {
		this.a=a;
		this.b=b;
	}
	void m2() {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Codes12 test=new Codes12();
		test.m1(3, 7);
		test.m2();

		// TODO Auto-generated method stub

	}

}
