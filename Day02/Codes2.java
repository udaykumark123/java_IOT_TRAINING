package codes;

public class Codes2 {
	void m1(int a) {
		System.out.println("invited");
	}
	void m1() {
		System.out.println("notinvited");
	}

	public static void main(String[] args) {
		Codes2 test=new Codes2();
		test.m1();
		test.m1(2);
		// TODO Auto-generated method stub

	}

}
