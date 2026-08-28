package praticeday5iot;

public class ptday68 {

	public static void main(String[] args) {
		int[] expenses= {100,200,300,150,250};
		int[] prefixSum=new int[expenses.length];
		prefixSum[0]=expenses[0];
		for(int i=1;i<expenses.length;i++) {
			prefixSum[i]=prefixSum[i-1]+expenses[i];
			
		}
		int sum=prefixSum[3]-prefixSum[0];
		System.out.println("Total Spent:$"+sum);
		// TODO Auto-generated method stub

	}

}
