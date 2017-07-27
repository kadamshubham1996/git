package InvoiceFunction;

/**
 * Created by rckstr on 7/24/2017.
 */
public class Cloath extends Item {
    static final int GST_RAT = 12;
    public Cloath(String name,double price,int quantity)
    {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public double getGst()
    {
        double Gst=(((price*GST_RAT)/100)*quantity);
        return Gst;
    }
}
