package Exception1;

/**
 * Created by rckstr on 8/18/2017.
 */
public class Exception1
{

    public Exception1()
    {
        try
        {
          int c;
          c=10/0;
          System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
