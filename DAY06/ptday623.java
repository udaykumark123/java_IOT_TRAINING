package praticeday5iot;

public class ptday623 {

	public static void main(String[] args) { 
	
	            String[] array1= {"uday","shishir"};
				String[] array2= {"nischal","prajwal","shikhar"};
				String[] merged=new String[array1.length+array2.length];
				for(int i=0;i<array1.length;i++) {
					merged[i]=array1[i];
					
				}
				for(int i=0;i<array2.length;i++) {
					merged[array1.length+i]=array2[i];
				}
				System.out.println("Merged Array:");
				for(int i=0;i<merged.length;i++) {
					System.out.println(merged[i]+" ");
				}
		// TODO Auto-generated method stub

	}

}
