package jvm;
import java.util.*;
import java.io.*;



class Solution1 {
    public static void main(String []arg) throws IOException {



//        Scanner sc = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(bufferedReader.readLine());

        for(int i=0;i<t;i++)
        {
            String s=" ";

            try
            {
                long x=Long.parseLong(bufferedReader.readLine());
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte\n* short\n* int\n* long");
                }else if(x>=-32768 && x<=32767){
                    System.out.printf("* short\n* int\n* long");
                }else if(x>=-2147483648 &&  x<=2147483647){
                    System.out.println("* int\n* long");
                }else{
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
                System.out.println(s+" can't be fitted anywhere.");
            }

        }
    }
}