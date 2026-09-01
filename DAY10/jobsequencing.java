package day11;

public class jobsequencing {

	public static void main(String[] args) {
		char[] job= {'A','B','C','D'};
		int[] deadline= {2,1,2,1};
		int[] profit= {100,50,20,30};
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<4;j++) {
				if(profit[i]<profit[j]) {
					int temp=profit[i];
					profit[i]=profit[j];
					profit[j]=temp;
					
					 temp=deadline[i];
					 deadline[i]=deadline[j];
					 deadline[j]=temp;
					 
					 char c=job[i];
					 job[i]=job[j];
					 job[j]=c;
					 
					 
				}
			}
		}
		 int[] slot = new int[3];
	        int totalProfit = 0;

	        for (int i = 0; i < 4; i++) {

	            for (int j = deadline[i]; j > 0; j--) {

	                if (slot[j] == 0) {
	                    slot[j] = job[i];
	                    totalProfit += profit[i];
	                    break;
	                }
	            }
	        }

	        System.out.println("Jobs:");

	        for (int i = 1; i < 3; i++) {
	            System.out.println((char) slot[i]);
	        }

	        System.out.println("Total Profit = " + totalProfit);
	    }
	
		
		
		
		// TODO Auto-generated method stub

	}


