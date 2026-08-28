package codes;

public class Codes8 {

	public static void main(String[] args) {
		int n=153;
		int original=n;
		int sum=0;
		for (int temp=n;temp>0;temp=temp/10) {
			int digit=temp % 10;
			
			sum=sum+(digit*digit*digit);
			
		}
		if (sum==original) {
			System.out.println("armstorng number");
		}else {
			System.out.println("not armstrong number");
		}
		// TODO Auto-generated method stub

	}

}
