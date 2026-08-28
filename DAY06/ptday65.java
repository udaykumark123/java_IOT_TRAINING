package praticeday5iot;

public class ptday65 {
		

		    public static void main(String[] args) {

		        int[] numbers = {10, 20, 30, 40, 50};
		        int k = 3;

		        int sum = 0;

		        // First window
		        for (int i = 0; i < k; i++) {
		            sum = sum + numbers[i];
		        }

		        System.out.println("Average: " + (sum / (double) k));

		        // Slide the window
		        for (int i = k; i < numbers.length; i++) {

		            sum = sum + numbers[i];
		            sum = sum - numbers[i - k];

		            System.out.println("Average: " + (sum / (double) k));
		        }
		    }
		
		// TODO Auto-generated method stub

	}


