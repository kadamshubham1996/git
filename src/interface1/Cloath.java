package interface1;

/**
 * Created by rckstr on 7/24/2017.
 */
public class  Cloath extends Item implements abc {
    static final int GST_RAT = 12;
    public Cloath(String name,double price,int quantity)
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

  }

