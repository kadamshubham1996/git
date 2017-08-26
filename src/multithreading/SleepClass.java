package multithreading;

/**
 * Created by rckstr on 8/26/2017.
 */
public class SleepClass {
    public void run(){
        try{
            System.out.println("befor sleep");
             Thread.sleep(1000);
            System.out.println("after sleep");

        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
        public static void main(String args[]){
        SleepClass SC=new SleepClass();
        SC.run();
        }

}
