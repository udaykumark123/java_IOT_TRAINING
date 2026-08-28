package praticeaday5iot;

public class code6d5 {
	public static void main(String[] args) {

		        String text = "programming";

		        findDuplicates(text);
		    }

		    static void findDuplicates(String text) {

		        for (int i = 0; i < text.length(); i++) {

		            for (int j = i + 1; j < text.length(); j++) {

		                if (text.charAt(i) == text.charAt(j)) {

		                    System.out.println("Duplicate character: " 
		                                       + text.charAt(i));

		                    break;
		                }
		            }
		        }
		    }
		

			}


