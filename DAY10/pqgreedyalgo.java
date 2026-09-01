package day11;
import java.util.PriorityQueue;


public class pqgreedyalgo {

	public static void main(String[] args) {
		PriorityQueue<Integer>  minHeap = new PriorityQueue<>();
		minHeap.add(30);
		minHeap.add(20);
		minHeap.add(10);
		minHeap.add(5);
		System.out.println("MIn heap:"+minHeap);
		System.out.println("Smallest element:"+minHeap.peek());
		// TODO Auto-generated method stub

	}

}
