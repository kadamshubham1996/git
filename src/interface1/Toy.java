
package interface1;

/**
 * Created by rckstr on 7/24/2017.
 */
public class Toy extends Item implements abc {
    static final int GST_RAT = 18;
    public Toy(String name,double price,int quantity)
    {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public double sum()
    {
        double sum=(price+quantity+abc);
        return sum;
    }
    public double getGst()
    {
        double Gst=(((price*GST_RAT)/100)*quantity);
        return Gst;
    }
}
