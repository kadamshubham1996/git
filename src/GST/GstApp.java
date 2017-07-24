package GST;

import GST.Cloath;
import GST.Toy;

/**
 * Created by rckstr on 7/24/2017.
 */
public class GstApp {
    public static void main(String args[]){

        Cloath cloath=new Cloath("shubham",45,3);
        Toy toy=new Toy("gopal",56,2);
        System.out.println(cloath.getGst());
        System.out.println(toy.getGst());

    }
}
