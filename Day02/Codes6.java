package codes;
class Grandparent{
	void bp() {
		System.out.println("understain");
	}
}
class Parent extends Grandparent{
	void cancer() {
		System.out.println("understain");
	}
}

public class Codes6 extends Parent{

	

	public static void main(String[] args) {
		Codes6 test=new Codes6();
		test.bp();
		test.cancer();
		// TODO Auto-generated method stub

	}

}
