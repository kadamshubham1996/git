package multithreading;

/**
 * Created by rckstr on 8/26/2017.
 */
public class ThreadDemo extends Thread {
    public void run(){
        for(int i=1;i<10;i++) {
            Thread t = Thread.currentThread();
            System.out.println("Thread" + t.getId() + "Running" + i);
            System.out.println("Priority before" + t.getPriority());
            t.setPriority(Thread.MAX_PRIORITY);
            System.out.println("Priority after" + t.getPriority());
            t.setPriority(Thread.MIN_PRIORITY);
        }

        }
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            ThreadDemo TD=new ThreadDemo();
            TD.start();
        }
}
}
