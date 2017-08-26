package multithreading;


public class Multithreading implements Runnable {
    public static void main(String args[]){
        Multithreading ml=new Multithreading();
        Thread t=new Thread();
        t.start();

    }
    public void run(){
        System.out.println("implimented Runnable");
    }

}
