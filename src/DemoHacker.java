import java.util.Scanner;

public class DemoHacker {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String result=String.format("%03d",x);
            System.out.println(s1+"\t\t"+result+" ");
        }
        System.out.println("================================");

    }
}