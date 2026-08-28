package codes;

public class shape {abstract class shape{
	abstract void area();
		
	}
class Circle extends shape{
	int r=5;
	void area() {
		System.out.println("area of the circle"+(Math.PI*r*r));
	}
}
class rectangle extends  shape{
	int l=3;
	int b=8;
	void area() {
		System.out.println("area of the rectangle"+(l*b));
		
		
	}
}



public class Codes111 {

	public static void main(String[] args) {
		shape s1=new Circle();
		s1.area();
		shape s2=new rectangle();
		s2.area();

}
