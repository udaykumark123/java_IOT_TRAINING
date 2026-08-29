package day9;

import java.util.*;
public class lexicalsearcjnum {

			public static void main(String[] args) {
				int[] numbers= {998023,998364,995645,909090};
				int search=998;
			
				ArrayList<Integer> result=new ArrayList<>();
				for(int number : numbers) {
					if(String.valueOf(number).contains(String.valueOf(search))) {
						result.add(number);
					}
				}
				System.out.println("Search results:");
				for(int number:result) {
					System.out.println(number);
				}
				
				
				
				// TODO Auto-generated method stub

			}


		// TODO Auto-generated method stub

	}


