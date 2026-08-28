package praticeday5iot;

public class ptday627 {

	public static void main(String[] args) {

		        String[] array1 = {"uday", "yash", "prajwal"};
		        String[] array2 = {"yash", "shikhar", "shishir"};

		        System.out.println("Intersection of two arrays:");

		        for (int i = 0; i < array1.length; i++) {

		            for (int j = 0; j < array2.length; j++) {

		                if (array1[i].equals(array2[j])) {
		                    System.out.println(array1[i]);
		                }
		            }
		        }
		
		// TODO Auto-generated method stub

	}

}
