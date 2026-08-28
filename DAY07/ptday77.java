package praticedayiot7;


public class ptday77 {
	static String correctPassword="123";
	static void tryPassword(String password) {
		System.out.println(" passwordTrying:"+password);
		if(password.equals(correctPassword)) {
			System.out.println("password found:"+password);
			return;
			
		}
		System.out.println("wrong password. go back and try again");
	}


	public static void main(String[] args) {
		tryPassword("123");
		tryPassword("213");
		tryPassword("321");
		// TODO Auto-generated method stub

	}

}
