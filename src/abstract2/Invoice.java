package abstract1;

/**
 * Created by rckstr on 7/24/2017.
 */
public class Invoice {

    public void printInvoice(Item item[]) {
        double totalGST = 0;
        double totalprice = 0;
        for (int i = 0; i < item.length; i++) {
            double GST = item[i].getGst();
            totalGST = totalGST + GST;
            totalprice = item[i].price;
            calculateInvoice(item[i]);

        }
        System.out.printf("%17s",(totalGST + totalprice));
    }

    private void calculateInvoice(Item item) {
        System.out.println(item.name + "\t" + item.price + "\t" + item.quantity);
    }

}


