package day11;

import java.util.*;

public class pqgreedyalgomax {

	public static void main(String[] args) {
		PriorityQueue<Integer>  maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		maxHeap.add(30);
		maxHeap.add(20);
		maxHeap.add(10);
		maxHeap.add(5);
		System.out.println("Max heap:"+maxHeap);
		System.out.println("Largest element:"+maxHeap.peek());
		// TODO Auto-generated method stub

	}

}
