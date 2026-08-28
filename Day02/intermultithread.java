package codes;

class intermultithread implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
        }
    }

    public static void main(String[] args) {

    	intermultithread obj = new intermultithread();

        Thread t1 = new Thread(obj);

        t1.start();
    }
}

}
