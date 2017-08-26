package Godownthread;

public class Godown {
    public static final int Capacity = 10;
    public static int currentItemCount;

    public synchronized void pushItem() {
        if (Capacity >= currentItemCount) {
            if (currentItemCount == 0) {
                System.out.println("godown is empty");
                notify();
            }
            currentItemCount++;
            System.out.println("enter the product");

        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void getItem() {
        if (currentItemCount == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } else {
            if (currentItemCount == Capacity) {
                System.out.println("remove the product");
                notify();
            }
            currentItemCount--;
            System.out.println("product is removing");
        }

    }

}
