package array;

public class studentresult {
	public static void main(String[] args) {
		int[] marks= {35,67,80,90,100};
		int passCount=0;
		int failCount=0;
		for(int mark:marks) {
			if(mark>=40) {
				passCount++;
				
			}else {
				System.out.println("number of students failed:"+failCount);
			}
			System.out.println("Number of sthudents who passed:"+passCount);
		}
	}

}
