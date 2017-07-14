import java.util.Scanner;

/**
 * Created by rckstr on 7/14/2017.
 */
public class EvenOdd {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the count");
        int n = scan.nextInt();
        int value[] = new int[n];
        System.out.println("enter the number");
        for (int i = 0; i<n; i++) {
            value[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (value[i] % 2 == 0) {
                int a = value[i] * value[i];
                System.out.println("My square is" + a);
            } else {
                int b = value[i] * value[i] * value[i];
                System.out.println("My cube is" + b);
            }
        }

    }
}


