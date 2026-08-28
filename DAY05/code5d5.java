package praticeday5iot;

public class code5d5 {

	public static void main(String[] args) {
		String text="l love java";
		String pattern="java";
		int position=search(text,pattern);
		if( position !=-1) {
			System.out.println("PAttern found in index:"+position);
			
			
		}else {
			System.out.println("pattern not found");
		}
		// TODO Auto-generated method stub

	}
	static int search(String text,String pattern) {
		int n=text.length();
		int m=pattern.length();
		for(int i=0;i<=n-m;i++) {
			int j;
			for(j=0;j<m;j++) {
				if(text.charAt(i+1)!=pattern.charAt(j)) {
					break;
				}
			}
			if(j==m) {
				return i;
			}
		}
		return -1;
	}

}
