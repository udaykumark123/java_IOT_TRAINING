package codes;

public class Codes7 {
	int r;
	Codes7(int x){
		r=x;
	}
	void area() {
		double result=Math.PI*r*r;
		System.out.println("Area of circle="+result);
		
	}


	public static void main(String[] args) {
		Codes7 obj=new Codes7(5);
		obj.area();
		// TODO Auto-generated method stub

	}

}
