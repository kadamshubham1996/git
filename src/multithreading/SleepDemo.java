package multithreading;

/**
 * Created by rckstr on 8/27/2017.
 */
public class SleepDemo extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread \n"+Thread.currentThread().getName()+"="+i);
            System.out.println("Thread \n "+Thread.activeCount());
        }

    }
    public static void main(String args[]){
        SleepDemo SD=new SleepDemo();
        SD.run();
    }
}
