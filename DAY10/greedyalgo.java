package day11;

public class greedyalgo {
	public static void main(String[] args) {
		int[] start= {1,3,4,5,6,7};
		int[] end= {4,5,6,7,8,9};
		int lastEnd = end[0];
		System.out.println("Activity 1");
		for(int i = 1; i < start.length; i++) {
			if(start[i] >= lastEnd) {
				System.out.println("Activity "+(i+1));
				lastEnd = end[i];
			}
		}
	}

}
