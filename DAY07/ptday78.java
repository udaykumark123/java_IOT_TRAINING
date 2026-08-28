package praticedayiot7;

public class ptday78 {

	    static String correctPassword = "123";

	    public static void main(String[] args) {

	        String[] passwords = {"213", "321", "123"};

	        int i = 0;

	        while (i < passwords.length) {

	            System.out.println("Password trying: " + passwords[i]);

	            if (passwords[i].equals(correctPassword)) {
	                System.out.println("Password found: " + passwords[i]);
	                break;
	            }

	            System.out.println("Wrong password. Try again.");
	            i++;
	        }
	    }
	}


