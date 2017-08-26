package Godownthread;

/**
 * Created by rckstr on 8/26/2017.
 */
public class ProductionApp {
    public static void main(String args[]){
        Godown g=new Godown();
        Producer p = new Producer(g);
        Producer p1=new Producer(g);
        Consumer c = new Consumer(g);
        Consumer c1 = new Consumer(g);

            p.start();
            p1.start();
            c.start();
            c1.start();


    }
}
