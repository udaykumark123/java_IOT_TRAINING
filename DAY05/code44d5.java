package praticeday5iot;
import java.util.Scanner;

public class code44d5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the string:");
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev)) {
			System.out.println("the string is palindrome:" +str);
		}else {
			System.out.println("the string is not palindrome:"+str);
		}
		// TODO Auto-generated method stub

	}

}
