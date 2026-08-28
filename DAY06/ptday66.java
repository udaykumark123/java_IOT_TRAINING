package praticeday5iot;

public class ptday66 {

	public static void main(String[] args) {
		int[] numbers= {-2,1,-3,4,-1,2,1,-5,4};
		int currentScore=0;
		int maxScore=0;
		for(int i=0;i<numbers.length;i++) {
			currentScore=currentScore+numbers[i];
			if(currentScore<0) {
				currentScore=0;
				
			}
			if(currentScore>maxScore) {
				maxScore=currentScore;
			}
		}
		System.out.println("Maximum score:"+maxScore);
		System.out.println("E:"+maxScore);
		// TODO Auto-generated method stub

	}

}
