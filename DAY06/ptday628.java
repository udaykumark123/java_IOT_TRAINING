package praticeday5iot;

public class ptday628 {

	public static void main(String[] args) {
		        Integer[] array1 = {1,2,3,4,6,7,8,9};
		        Integer[] array2 = {2,3,4,6,7,9};

		        System.out.println("Intersection of two arrays:");

		        for (int i = 0; i < array1.length; i++) {

		            for (int j = 0; j < array2.length; j++) {

		            	if (array1[i].equals(array2[j])) {
		                    System.out.println(array1[i]);
		                }
		            }
		        }
		    }
		
		// TODO Auto-generated method stub

	}


