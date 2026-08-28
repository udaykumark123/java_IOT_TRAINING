package codes;

 import java.util.Iterator;
 class Mytask implements Runnable{
	 public void run() {
		 for(int i=1;i<=5;i++) {
			 System.out.println("hhh"+i);
		 }
	 }
 }
 public class multithreadind43{
	 public static void main(String[] args) {
		 Mytask task=new Mytask();
		 Thread t=new Thread(task);
		 
		 t.start();
		 for(int i=1;i<=5;i++) {
			 System.out.println("nisha"+i);
		 }
		 
	 
	 for(int i=1;i<=5;i++) {
		 System.out.println("nahsh"+i);
	 }
 }
 }