package codes;
abstract class shape{
	abstract void area();	
	}

class Circle extends shape{
	int r=5;
	void area() {
		System.out.println("area of the circle:"+(Math.PI*r*r));
		
	}
}
class triangle extends shape{
	int h=2;
	int b=3;
	void area() {
		System.out.println("area of triangle:"+(0.5*b*h));
	}
}

public class Codes10 {
	

	public static void main(String[] args) {
		shape tt=new Circle ();
		tt.area();
		shape t2=new triangle();
		t2.area();
		// TODO Auto-generated method stub

	}

}
