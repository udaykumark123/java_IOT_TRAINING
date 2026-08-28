package day3;

public class basicc {

	public static void main(String[] args) {
		int n=1000;
		int[] students=new int[n];
		for(int i=0;i<n;i++) {
			students[i]=i+1;
		}
		int target=1000;
		boolean found=false;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(students[j]==target) {
					found=true;
					break;
				}
			}if(found) {
				break;
			}
		}System.out.println("student found:"+found);
		// TODO Auto-generated method stub

	}

}
