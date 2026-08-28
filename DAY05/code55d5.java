package praticeday5iot;

public class code55d5 {

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
		int patternHash=getHash(pattern);
		for(int i=0;i<=n-m;i++) {
			String part=text.substring(i,i+m);
			int partHash=getHash(part);
			if(patternHash==partHash) {
				if(part.equals(pattern)) {
					return i;
				}
			}
		}
		return -1;
	}
	static int getHash(String str) {
		int hash=0;
		for(int i=0;i<str.length();i++) {
			hash=hash+str.charAt(i);
		}
		return hash;
	}

}
