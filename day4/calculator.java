package array;


public class calculator {
	int a,b; 
	calculator(int x,int y){
		a=x;
		b=y;
	}
		void add() {
			System.out.println("Addition:"+ (a+b));
		}
		void sub() {
			System.out.println("sub:" +(a-b));
		}void multi() {
			System.out.println("multi:" +(a*b));
		}
		void divide() {
			System.out.println("division:" +(a%b));
		}
	

	public static void main(String[] args) {
		calculator test=new calculator(10,20);
		test.add();
		test.sub();
		test.divide();
		test.multi();
		
		
		// TODO Auto-generated method stub

	}

}
