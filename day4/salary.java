package array;

public class salary {

	public static void main(String[] args) {
		int[] salaries = {10000,15000,12000,18000,20000};
		int totalsalary=0;
		for(int salary:salaries) {
			if(salary<0) {
				System.out.println("invalid salary:"+salary);
				return;
				
			}
			totalsalary+=salary;
			}
		System.out.println("Total salary of all employee:"+totalsalary);
			
		}
		// TODO Auto-generated method stub

	}


