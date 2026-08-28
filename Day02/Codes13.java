package codes;
class parents{
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}

public class Codes13 extends parents{

	public static void main(String[] args) {
		Codes13 test=new Codes13();
		test.setA(11);
		int aa=test.getA();
		System.out.println(aa);
		
		
		// TODO Auto-generated method stub

	}

	
}
