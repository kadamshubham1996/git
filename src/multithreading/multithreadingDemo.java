package multithreading;


public class multithreadingDemo extends Thread {
    public static void main(String args[]) {
        multithreadingDemo multiDemo = new multithreadingDemo();
        multiDemo.start();
    }
    public void run() {
        System.out.println("Thread runing");
    }

}

