package interface1;

/**
 * Created by rckstr on 7/24/2017.
 */
public class GstApp {
    public static void main(String args[]){
         Item items[]=new Item[2];
         Cloath cloath=new Cloath("shubham", 45, 3);
        Toy toy=new Toy("gopal", 56, 2);
        items[0]=cloath;
        items[1]=toy;
        Invoice invoice=new Invoice();
        invoice.printInvoice(items);

    }
}
