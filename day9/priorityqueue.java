package day9;
import java.util.PriorityQueue;
 class paitent{
	String name;
	int priority;
	paitent(String name,int priority){
		this.name=name;
		this.priority=priority;
		
		
	}
 }
	public class priorityqueue{
	public static void main(String[] args) {
		PriorityQueue<paitent> queue=new PriorityQueue<>((p1,p2) -> p1.priority -p2.priority);
		queue.add(new paitent("Anand",2));
		queue.add(new paitent("Rahul",3));
		queue.add(new paitent("Priya",8));
		queue.add(new paitent("John",6));
		while(!queue.isEmpty()) {
			paitent p=queue.poll();
			System.out.println(p.name + " -Priority"+  p.priority );
		}
	}
	
		
		
		
		
		
		// TODO Auto-generated method stub

	}


