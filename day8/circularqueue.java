package day8;

public class circularqueue {
	    int[] q = new int[5];
	    int front = -1, rear = -1;

	    void enqueue(int x) {
	        if ((rear + 1) % q.length == front) {
	            System.out.println("Queue Full");
	            return;
	        }
	        if (front == -1) front = 0;
	        rear = (rear + 1) % q.length;
	        q[rear] = x;
	    }

	    void dequeue() {
	        if (front == -1) {
	            System.out.println("Queue Empty");
	            return;
	        }
	        System.out.println("Deleted: " + q[front]);
	        if (front == rear)
	            front = rear = -1;
	        else
	            front = (front + 1) % q.length;
	    }

	    void display() {
	        if (front == -1) return;
	        int i = front;
	        while (true) {
	            System.out.print(q[i] + " ");
	            if (i == rear) break;
	            i = (i + 1) % q.length;
	        }
	    }

	    public static void main(String[] args) {
	        circularqueue c = new circularqueue();

	        c.enqueue(10);
	        c.enqueue(20);
	        c.enqueue(30);
	        c.display();
	        c.dequeue();
	        c.enqueue(40);
	        c.display();
	    }
	}

