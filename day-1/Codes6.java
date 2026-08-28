package codes;

public class Codes6 {
	int height,base;
	Codes6(int b,int h){
		base=b;
		height=h;
	}
	void area() {
		double result=0.5*base*height;
		System.out.println("Area of triangle="+result);
		
	}

	public static void main(String[] args) {
		Codes6 obj=new Codes6(2,5);
		obj.area();
		// TODO Auto-generated method stub

	}

}
