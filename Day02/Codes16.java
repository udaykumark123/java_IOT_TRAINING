package codes;
interface atm{
	abstract void depo();
	abstract void with();
}
abstract class abc implements atm{
	public void depo() {
		System.out.println("depo");
		
	}
}
public class Codes16 extends abc{
	public void with() {
		System.out.println("with");
	}



public static void main(String[] args) {
	Codes16 v=new Codes16();
	v.depo();
	v.with();
		// TODO Auto-generated method stub

	}

}
