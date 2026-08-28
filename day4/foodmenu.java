package array;

import java.util.Scanner;

public class foodmenu {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the food menu(1-7):");
				int menu=sc.nextInt();
				switch(menu) {
				case 1:
					System.out.println("pizza");
					break;
				case 2:
					System.out.println("pasta");
					break;
				case 3:
					System.out.println("roti");
					break;
				case 4:
					System.out.println("burgger");
					break;
				case 5:
					System.out.println("wings");
					break;
				case 6:
					System.out.println("photowings");
					break;
				case 7:
					System.out.println("sandwich");
				break;
				default:
					System.out.println("invaid choose");
				
				
				}
				sc.close();
				
				
				// TODO Auto-generated method stub

			}

		
		// TODO Auto-generated method stub

	}


