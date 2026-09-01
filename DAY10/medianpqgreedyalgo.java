package day11;
import java.util.*;

public class medianpqgreedyalgo {
	


	    public static void main(String[] args) {

	        int[] a = {10, 20, 30, 40, 50};

	        PriorityQueue<Integer> maxHeap =
	                new PriorityQueue<>(Collections.reverseOrder());

	        PriorityQueue<Integer> minHeap =
	                new PriorityQueue<>();

	        for (int x : a) {

	            if (maxHeap.isEmpty() || x <= maxHeap.peek())
	                maxHeap.add(x);
	            else
	                minHeap.add(x);
	            if (maxHeap.size() > minHeap.size() + 1)
	                minHeap.add(maxHeap.poll());

	            if (minHeap.size() > maxHeap.size())
	                maxHeap.add(minHeap.poll());
	        }

	        double median;

	        if (maxHeap.size() == minHeap.size())
	            median = (maxHeap.peek() + minHeap.peek()) / 2.0;
	        else
	            median = maxHeap.peek();

	        System.out.println("Median = " + median);
	    }
	}


