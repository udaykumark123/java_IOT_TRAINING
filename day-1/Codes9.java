package codes;

public class Codes9 {

    int n;

    // Constructor
    Codes9(int x) {
        n = x;
    }

    void palindrome() {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

	    
	public static void main(String[] args) {
		Codes9 obj=new Codes9(121);
		obj.palindrome();
		// TODO Auto-generated method stub

	}

}
