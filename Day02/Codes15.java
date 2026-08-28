package codes;
interface atm{
	abstract void dep();
}
interface atm1{
	abstract void with();
	
}

public class Codes15 implements atm,atm1 {
	public void dep() {
		System.out.println("dep");
	}
	public void with() {
		System.out.println("with");
	}
	public static void main(String[] args) {
		Codes15 test=new Codes15();
		test.with();
		test.dep();
	}

}
