package codes;
class parents{
	void property() {
		System.out.println("property");
	}
	void marry() {
		System.out.println("family selected girl");
	}
}

public class Codes4 extends parents {
	void marry() {
		System.out.println("campus selected girl");
	}

	public static void main(String[] args) {
		Codes4 test=new Codes4();
		test.marry();
		test.property();
		// TODO Auto-generated method stub

	}

}
