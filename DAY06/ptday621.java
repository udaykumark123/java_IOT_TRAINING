package praticeday5iot;

public class ptday621 {

	public static void main(String[] args) {
		int[] profit= {100,200,150,300,250};
		int sum=profit[0]+profit[1]+profit[2];
		int max=sum;
		for(int i=3;i<profit.length;i++) {
			sum=sum+profit[i]-profit[i-3];
			 if(sum>max) {
				 max=sum; 
			 }
		}
		System.out.println("Highest 3 day profits:"+max);
		// TODO Auto-generated method stub

	}

}
