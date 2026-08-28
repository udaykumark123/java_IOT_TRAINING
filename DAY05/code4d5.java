package praticeday5iot;
import java.util.Scanner;

public class code4d5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();

		if(str.contains("abcd")) {
			System.out.println("Substring is present in given string"+str);
		}else {
			System.out.println("Substring not available in given string"+str);
		}
		
		// TODO Auto-generated method stub

	}

}
