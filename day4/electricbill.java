package array;

public class electricbill {
	public static void main(String[] args) {
		int[] units= {10,20,30,40,50};
		int total=0;
		for(int unit:units) {
			total+=unit;
			
		}
		System.out.println("Total electric consumption for 7 days:"+total+"units");
		
	}

}
