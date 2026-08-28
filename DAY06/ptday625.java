package praticeday5iot;

public class ptday625 {

	public static void main(String[] args) {
		int[] array1= {10,20,30};
		int[] array2= {40,50,60};
		int[] merged=new int[array1.length+array2.length];
		for(int i=0;i<array1.length;i++) {
			merged[i]=array1[i];
			
		}
		for(int i=0;i<array2.length;i++) {
			merged[array1.length+i]=array2[i];
		}
		System.out.println("Merged Array without duplicate:");
		for(int i=0;i<merged.length;i++) {
			boolean duplicate=false;
			for(int j=0;j<1;j++) {
				if(merged[i]==merged[j]) {
					duplicate=true;
					break;
				}
			if(!duplicate) {
				System.out.println(merged[i]+"");
			}
		}
	}
  }
}
			
			
		
			
		// TODO Auto-generated method stub

	


