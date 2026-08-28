package codes;
class grandparent{
	void bp() {
		System.out.println("understain bp");

	}
	class parent extends grandparent{
		void cancer() {
			System.out.println("understain");
		}
	}
}

public class Codes14 extends parent {

	public static void main(String[] args) {
		Codes14 test=new Codes14();
		test.bp();
		test.cancer();
		
		
		// TODO Auto-generated method stub

	}

}
