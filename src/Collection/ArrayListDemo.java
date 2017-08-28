package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rckstr on 8/28/2017.
 */
public class ArrayListDemo {
    List arr;
    public static void main(String args[]) throws ArrayIndexOutOfBoundsException {
        try {
            Scanner sn=new Scanner(System.in);

            List ls = new ArrayList();
            for(int j=0;j<5;j++){

                System.out.println("the value");
                String s=sn.nextLine();
                ls.add(s);
            }
            System.out.println("Value==>"+ls.get(1));
              for(Object i: ls) {
                  System.out.println( i);
              }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }

}
