package codes;
abstract class Codes111{
	abstract void area();
		
	}
class Circle extends Codes111 {
	int r=5;
	void area() {
		System.out.println("area of the circle"+(Math.PI*r*r));
	}
}
class rectangle extends  Codes111{
	int l=3;
	int b=8;
	void area() {
		System.out.println("area of the rectangle"+(l*b));
		
		
	}
}



public class Codes111 {

	public static void main(String[] args) {
		Codes111 s1=new Circle();
		s1.area();
		Codes111 s2=new rectangle();
		s2.area();
		// TODO Auto-generated method stub

	}

}
