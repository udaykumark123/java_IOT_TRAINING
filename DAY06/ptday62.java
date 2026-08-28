package praticeday5iot;

public class ptday62 {

	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50};
		int windowSize=4;
		int sum=0;
		for(int i=0;i<windowSize;i++) {
			sum=sum+numbers[i];
		}
		System.out.println("Sum:"+sum);
		int start=0;
		for(int end=windowSize;end<numbers.length;end++) {
			sum=sum-numbers[start];
			sum=sum+numbers[end];
			start++;
			System.out.println("Sum:"+sum);
		}
		// TODO Auto-generated method stub

		}

}
