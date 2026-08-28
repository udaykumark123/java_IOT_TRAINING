package praticeday5iot;

public class ptday631 {

	public static void main(String[] args) {
		

		    int[] numbers = {6,3,5,6,7,2,1,3};

		    for (int i = 0; i < numbers.length - 1; i++) {

		        for (int j = i + 1; j < numbers.length; j++) {

		            if (numbers[i] < numbers[j]) {

		                int temp = numbers[i];
		                numbers[i] = numbers[j];
		                numbers[j] = temp;
		            }
		        }
		    }

		    System.out.println("Descending order:");

		    for (int i = 0; i < numbers.length; i++) {
		        System.out.print(numbers[i] + " ");
		    }
		}
		// TODO Auto-generated method stub

	}


