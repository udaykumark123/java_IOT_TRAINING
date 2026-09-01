package day11;

public class greedypai {

	public static void main(String[] args) {
		int[] paitent= {1,2,3,4,5};
		int[] start= {2,3,6,5,0};
		int[] end= {4,6,5,3,9};
		int lastEnd=end[0];
		System.out.println("Selected paitent:");
		for(int i=1;i<paitent.length;i++) {
			if(start[i]>=lastEnd) {
				System.out.println("Paitent "+(i+1));
				lastEnd=end[i];
				
			}
		}
		// TODO Auto-generated method stub

	}

}
