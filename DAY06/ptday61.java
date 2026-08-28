package praticeday5iot;

public class ptday61 {

	public static void main(String[] args) {
		

		        int[] students = {10, 20, 30, 40, 50, 60, 70};
		        int target = 80;

		        int left = 0;
		        int right = students.length - 1;

		        while (left < right) {

		            int sum = students[left] + students[right];

		            if (sum == target) {
		                System.out.println("Students found: "
		                        + students[left] + " and " + students[right]);
		                break;
		            }
		            else if (sum < target) {
		                left++;
		            }
		            else {
		                right--;
		            }
		        }
		    }
		
		// TODO Auto-generated method stub

	}


