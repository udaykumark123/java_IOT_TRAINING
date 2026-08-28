package praticeaday5iot;
import java.util.Scanner;

public class code7d5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1 = sc.nextLine();
		System.out.println("enter the STring:");
		String str2=sc.nextLine();
		if(isAnagram(str1,str2)) {
			System.out.println("Anagram");
	
		}else {
			System.out.println("Not anagram");
		}
		
		
		// TODO Auto-generated method stub

	}
	static boolean isAnagram(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		int[] count=new int[256];
		for(int i=0;i<str1.length();i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
			
		}
		for(int i=0;i<256;i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		return true;
	}

}

