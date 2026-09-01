package day11;

public class fractionalknapsack {
	public static void main(String[] args) {
		
		        int[] weight = {10, 20, 30};
		        int[] profit = {60, 100, 120};

		        int capacity = 50;
		        double totalProfit = 0;

		        // Calculate profit/weight ratio
		        double[] ratio = new double[3];

		        for (int i = 0; i < 3; i++) {
		            ratio[i] = (double) profit[i] / weight[i];
		        }

		        // Sort by ratio (highest first)
		        for (int i = 0; i < 3; i++) {
		            for (int j = i + 1; j < 3; j++) {

		                if (ratio[i] < ratio[j]) {

		                    double temp = ratio[i];
		                    ratio[i] = ratio[j];
		                    ratio[j] = temp;

		                    temp = weight[i];
		                    weight[i] = weight[j];
		                    weight[j] = (int) temp;

		                    int x = profit[i];
		                    profit[i] = profit[j];
		                    profit[j] = x;
		                }
		            }
		        }

		        // Fill the bag
		        for (int i = 0; i < 3; i++) {

		            if (weight[i] <= capacity) {
		                capacity -= weight[i];
		                totalProfit += profit[i];
		            } 
		            else {
		                totalProfit += ratio[i] * capacity;
		                capacity = 0;
		                break;
		            }
		        }

		        System.out.println("Maximum Profit = " + totalProfit);
		    }
		}
		
	


