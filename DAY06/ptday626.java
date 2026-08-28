package praticeday5iot;

public class ptday626 {

	public static void main(String[] args) {
		        String[] array1 = {"uday", "yash", "prajwal"};
		        String[] array2 = {"yash", "shikhar", "shishir"};

		        String[] merged = new String[array1.length + array2.length];

		        // Copy array1
		        for (int i = 0; i < array1.length; i++) {
		            merged[i] = array1[i];
		        }
		        for (int i = 0; i < array2.length; i++) {
		            merged[array1.length + i] = array2[i];
		        }

		        System.out.println("Merged Array without duplicate:");

		        for (int i = 0; i < merged.length; i++) {

		            boolean duplicate = false;

		            for (int j = 0; j < i; j++) {

		                if (merged[i].equals(merged[j])) {
		                    duplicate = true;
		                    break;
		                }
		            }

		            if (!duplicate) {
		                System.out.println(merged[i]);
		            }
		        }
		    }
		
	

	}


