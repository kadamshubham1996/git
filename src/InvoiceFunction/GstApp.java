package InvoiceFunction;

/**
 * Created by rckstr on 7/24/2017.
 */
public class GstApp {
    public static void main(String args[]){
         Item items[]=new Item[2];
         Cloath cloath=new Cloath("shubham",45,3);
        Toy toy=new Toy("gopal",56,2);
        items[0]=cloath;
        items[1]=toy;

        System.out.println(items[0].getGst());
        System.out.println(items[1].getGst());

        Invoice invoice=new Invoice();
        invoice.printInvoice(items);

    }
}
