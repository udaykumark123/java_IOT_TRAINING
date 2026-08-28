package codeoptimisization;

public class code1forloop {

	public static void main(String[] args) {
		int n=1000;
		int [] students=new int[n];
		
		int target=1000;
		boolean found = false;
		for(int i=0;i<n;i++) {
			students[i]=i+1;
			if(students[i]==target) {
				found=true;
				break;
				
			}
			
		}
		System.out.println("Stundent found:"+found);


	}

}
