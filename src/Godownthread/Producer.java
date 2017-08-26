package Godownthread;

/**
 * Created by rckstr on 8/26/2017.
 */
public class Producer extends Thread {

    Godown godown;

   Producer(Godown g){
       this.godown=g;
   }
 public void run(){
       for(int i=0;i<100;i++){
           godown.pushItem();
       }

 }


}