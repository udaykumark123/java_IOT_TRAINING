package codes;
import java.util.iterator;

public class multhitreading extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("method"+i);
		}
	}
	public static void main(String[] args) {
		multhitreading bb=new multhitreading();
		bb.start();
		for(int i=0;i<5;i++) {
			System.out.println("main method"+i);
		}
	}

}
